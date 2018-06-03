package pl.edu.pw.elka.wjanaszek.asist;

import pl.edu.pw.elka.wjanaszek.asist.domain.Script;
import pl.edu.pw.elka.wjanaszek.asist.domain.function.FunctionCall;
import pl.edu.pw.elka.wjanaszek.asist.domain.if_stat.*;
import pl.edu.pw.elka.wjanaszek.asist.domain.import_stat.ImportStatement;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.NotificationStatement;
import pl.edu.pw.elka.wjanaszek.asist.domain.search.SearchFunction;
import pl.edu.pw.elka.wjanaszek.asist.domain.task.ActionTask;
import pl.edu.pw.elka.wjanaszek.asist.domain.task.BaseTask;
import pl.edu.pw.elka.wjanaszek.asist.domain.task.NotificationTask;
import pl.edu.pw.elka.wjanaszek.asist.domain.variable.*;
import pl.edu.pw.elka.wjanaszek.asist.parser.ParserImpl;
import pl.edu.pw.elka.wjanaszek.asist.utils.ClassLoader;
import pl.edu.pw.elka.wjanaszek.asist.utils.StringUtil;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Asist {

    private static Map<String, BaseTask> notificationMap = new HashMap<>();
    private static final Map<String, Class> packageMap = new HashMap<>();
    private static final Map<String, Object> variableMap = new HashMap<>();
    private static final ClassLoader classLoader = new ClassLoader();

    public static void main(String[] args) {
        if (args.length == 1) {
            try {
                serveSource(readFile(args[0]).collect(Collectors.joining("\n")));
            } catch (IOException e) {
                e.printStackTrace();
            } catch (IllegalStateException e) {
                handleIllegalStateException(e);
            }
        } else if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            String source;
            while (!scanner.hasNext("quit")) {
                source = scanner.nextLine();
                try {
                    serveSource(source);
                } catch (IllegalStateException e) {
                    handleIllegalStateException(e);
                }
            }
        } else {
            System.err.println("Too many arguments");
        }
    }

    private static String arithmeticOperation(ArithmeticOperation a) {
        List<MultiplyExpression> multiplyExpressionList = a.getMultiplyExpressionList();
        List<AdditionOperator> additionOperatorList = a.getOperatorList();
        List<String> values = new ArrayList<>();
        List<AdditionOperator> operators = new ArrayList<>(additionOperatorList);

        for (MultiplyExpression m : multiplyExpressionList) {
            List<String> valuesQueue = new ArrayList<>();
            List<MultiplicationOperator> operatorsQueue = new ArrayList<>();
            // get values from atom expressions and push them on valuesQueue
            for (AtomExpression ae : m.getAtomExpressionList()) {
                if (ae.getIdentifier() != null) {
                    if (variableMap.containsKey(ae.getIdentifier())) {
                        valuesQueue.add(variableMap.get(ae.getIdentifier()).toString());
                    } else {
                        throw new IllegalStateException(ae.getIdentifier());
                    }
                } else if (ae.getValue() != null) {
                    valuesQueue.add(ae.getValue().toString());
                }
            }

            // get operators and push them on operators queue
            operatorsQueue.addAll(m.getOperatorList());

            // compute them and set value for given multiply expression
            if (valuesQueue.size() > 1) {
                while (valuesQueue.size() > 1) {
                    Integer val1, val2;
                    try {
                        val1 = Integer.valueOf(valuesQueue.get(0));
                        valuesQueue.remove(0);
                        val2 = Integer.valueOf(valuesQueue.get(0));
                        valuesQueue.remove(0);
                    } catch (NumberFormatException e) {
                        // e.printStackTrace();
                        throw new IllegalStateException("Bad arithmetic expression (not a valid number)");
                    }
                    MultiplicationOperator operator = operatorsQueue.get(0);
                    operatorsQueue.remove(0);
                    Integer result;
                    switch (operator) {
                        case MULTIPLY:
                            result = val1 * val2;
                            break;
                        case DIVIDE:
                            result = val1 / val2;
                            break;
                        default:
                            result = 0;
                            break;
                    }

                    valuesQueue.add(0, result.toString());
                }
            } else if (valuesQueue.size() == 0) {
                throw new IllegalStateException("Bad arithmetic expression (1)");
            }

            if (valuesQueue.size() == 1) {
                m.setValue(valuesQueue.get(0));
            } else {
                throw new IllegalStateException("Bad arithmetic expression (2)");
            }
            values.add(m.getValue());
        }

        if (values.size() > 1) {
            while (values.size() > 1) {
                Integer val1, val2;
                try {
                    val1 = Integer.valueOf(values.get(0));
                    values.remove(0);
                    val2 = Integer.valueOf(values.get(0));
                    values.remove(0);
                } catch (NumberFormatException e) {
                    // e.printStackTrace();
                    throw new IllegalStateException("Bad arithmetic expression (not a valid number)");
                }
                AdditionOperator operator = operators.get(0);
                operators.remove(0);
                Integer result;
                switch (operator) {
                    case ADD:
                        result = val1 + val2;
                        break;
                    case REMOVE:
                        result = val1 - val2;
                        break;
                    default:
                        result = 0;
                        break;
                }

                values.add(0, result.toString());
            }
        } else if (values.size() == 0) {
            throw new IllegalStateException("Bad arithmetic expression (3)");
        }

        if (values.size() == 1) {
            return values.get(0);
        } else {
            throw new IllegalStateException("Bad arithmetic expression (4)");
        }
    }

    private static Object functionCall(FunctionCall statement) throws IllegalStateException {
        Object o = null;
        if (statement != null && statement.getIdentifier() != null && statement.getIdentifier().equals("print")) {
            String message = statement.getParams().stream()
                    .map(s -> {
                        // resolve variable value
                        if (!s.startsWith("\'") && !s.startsWith("\"")) {
                            if (variableMap.containsKey(s)) {
                                return variableMap.get(s).toString();
                            } else {
                                throw new IllegalStateException(s);
                            }
                        } else {
                            return StringUtil.removeQuotesAndDoubleQuotes(s);
                        }
                    })
                    .collect(Collectors.joining(""));
            System.out.println(message);
        } else if (statement != null && statement.getIdentifier() != null && statement.getIdentifier().equals("turn_off")) {
            if (statement.getParams() != null && statement.getParams().size() > 0 && statement.getParams().get(0).equals("all")) {
                toggleAllNotifications();
            } else if (statement.getParams() != null) {
                notificationMap.keySet().stream()
                        .filter(k -> k.equals(statement.getParams().get(0)))
                        .forEach(k -> {
                            BaseTask task = notificationMap.get(k);
                            task.toggleNotification();
                        });
            }
        } else if (statement != null && statement.getIdentifier() != null && statement.getIdentifier().equals("turn_on")) {
            if (statement.getParams() != null && statement.getParams().size() > 0 && statement.getParams().get(0).equals("all")) {
                toggleAllNotifications();
            } else if (statement.getParams() != null)
                notificationMap.keySet().stream()
                        .filter(k -> k.equals(statement.getParams().get(0)))
                        .forEach(k -> {
                            BaseTask task = notificationMap.get(k);
                            task.toggleNotification();
                        });
        } else if (statement != null && statement.getIdentifier() != null && statement.getIdentifier().equals("delete")) {
            if (statement.getParams() != null && statement.getParams().size() > 0 && statement.getParams().get(0).equals("all")) {
                notificationMap = new HashMap<>();
            } else if (statement.getParams() != null && statement.getParams().size() > 0) {
                final String key = StringUtil.removeQuotesAndDoubleQuotes(statement.getParams().get(0));
                notificationMap.entrySet().removeIf(n -> n.getKey().equals(key));
            } else {
                throw new IllegalStateException("Bad entry for delete function");
            }
        } else {
            // check if it is not a method from any imported package
            // @TODO
            if (statement != null && statement.getIdentifier() != null) {
                for (String key : packageMap.keySet()) {
                    if (packageMap.containsKey(key)) {
                        Method m = null;
                        try {
                            m = packageMap.get(key).getMethod(statement.getIdentifier());
                        } catch (NoSuchMethodException e) {
                            // method can be in another package
                        }

                        if (m != null) {
                            try {
                                m.invoke(null, statement.getParams());
                            } catch (IllegalAccessException e) {
                                throw new IllegalStateException("Bad entry for method " + statement.getIdentifier() + " from package " + key);
                            } catch (InvocationTargetException e) {
                                throw new IllegalStateException("Bad entry for method " + statement.getIdentifier() + " from package " + key);
                            }
                        }
                    }
                }
                throw new IllegalStateException(statement.getIdentifier());
            } else {
                throw new IllegalStateException("Bad function call entry");
            }
        }
        return o;
    }

    private static String getObjectProperties(ObjectProperties statement) throws IllegalStateException {
        List<String> propertiesList = statement.getPropertiesList();
        String value = null;
        // first check if it's now object (containing the newest date)
        if (propertiesList.size() > 0 && propertiesList.get(0).equals("now")) {
            if (propertiesList.size() > 2) {
                throw new IllegalStateException("to many properties to object now-date");
            } else {
                if (propertiesList.get(1).equals("day")) {
                    value = new SimpleDateFormat("dd").format(new Date());
                } else if (propertiesList.get(1).equals("month")) {
                    value = new SimpleDateFormat("MM").format(new Date());
                } else if (propertiesList.get(1).equals("year")) {
                    value = new SimpleDateFormat("yyyy").format(new Date());
                } else if (propertiesList.get(1).equals("hour")) {
                    value = new SimpleDateFormat("HH").format(new Date());
                } else if (propertiesList.get(1).equals("minute")) {
                    value = new SimpleDateFormat("mm").format(new Date());
                } else if (propertiesList.get(1).equals("second")) {
                    value = new SimpleDateFormat("ss").format(new Date());
                } else {
                    throw new IllegalStateException(propertiesList.get(1));
                }
            }
        } else if (propertiesList.size() > 0) {
            for (String key : packageMap.keySet()) {
                // @TODO
                Field f = null;
                if (packageMap.containsKey(key)) {
                    try {
                        f = packageMap.get(key).getField(propertiesList.get(0));
                    } catch (NoSuchFieldException e) {
                        // it can be in another package
                    }

                    if (f != null) {
                        try {
                            value = f.get(propertiesList.get(0)).toString();
                            break;
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Bad entry for object properties " + propertiesList.get(0) + " from package " + key);
                        }
                    }
                }
            }
            if (value == null) {
                throw new IllegalStateException(propertiesList
                        .stream()
                        .collect(Collectors.joining(", ")));
            }
        }
        return value;
    }

    private static void handleIllegalStateException(IllegalStateException e) {
        if (e.getMessage().equals("unknown")) {
            System.err.println("Unknown error occured");
        } else if (e.getMessage().startsWith("Duplicate id")) {
            System.err.println(e.getMessage());
        } else if (e.getMessage().startsWith("Not initialized")) {
            System.err.println(e.getMessage());
        } else if (e.getMessage().startsWith("Problem")) {
            System.err.println(e.getMessage());
        } else if (e.getMessage().startsWith("Bad")) {
            System.err.println(e.getMessage());
        } else if (e.getMessage().startsWith("No package")) {
            System.err.println(e.getMessage());
        } else {
            System.err.println("No element " + e.getMessage() + " found");
        }
    }

    private static void ifStatement(IfStatement statement) throws IllegalStateException {
        if (resolveConditionExpression(statement.getConditionExpression())) {
            serveInstructionList(statement.getIfInstructionList());
        } else if (statement.getElseInstructionList() != null) {
            serveInstructionList(statement.getElseInstructionList());
        }
    }

    private static void importPackage(ImportStatement statement) throws IllegalStateException {
        if (statement.getPackageName() != null) {
            if (!packageMap.containsKey(statement.getPackageName())) {
                try {
                    Class c = classLoader.loadClass("/packages", statement.getPackageName());
                    packageMap.put(statement.getPackageName(), c);
                } catch (MalformedURLException | ClassNotFoundException e) {
                    throw new IllegalStateException(statement.getPackageName());
                }
            }
        }
    }

    private static void notification(NotificationStatement statement) throws IllegalStateException {
        if (statement != null && statement.getActionTypeParams() != null && statement.getActionTypeParams().size() == 1
                && statement.getActionTypeParams().get(0).equals("os_notification")) {
            if (notificationMap.containsKey(statement.getIdentifier())) {
                throw new IllegalStateException("Duplicate id " + statement.getIdentifier());
            }
            NotificationTask task = new NotificationTask(
                    false,
                    statement.getMessage(),
                    statement.getIdentifier()
            );
            task.setTimeValues(statement, packageMap);
            notificationMap.put(statement.getIdentifier(), task);
            notificationMap.get(statement.getIdentifier()).toggleNotification();
        } else if (statement != null && statement.getActionTypeParams() != null && statement.getActionTypeParams().size() >= 1) {
            List<String> actionTypeParams = statement.getActionTypeParams();
            ActionTask actionTask = new ActionTask();
            Method m = null;
            Object o = null;
            String[] params = null;
            for (String key : packageMap.keySet()) {
                try {
                    List<String> paramsList = actionTypeParams.size() > 1 ? actionTypeParams.subList(1, actionTypeParams.size()) : null;

                    Class c = packageMap.get(key);
                    Constructor constructor = c.getConstructor();
                    constructor.setAccessible(true);
                    o = constructor.newInstance();

                    List<Class> tmp = new ArrayList<>();
                    for (int i = 0; i < actionTypeParams.size(); i++) {
                        tmp.add(String.class);
                    }

                    System.out.println(tmp.size());

                    Class[] methodParams = new Class[tmp.size()];
                    tmp.toArray(methodParams);

                    params = new String[paramsList.size() + 1];
                    paramsList.toArray(params);
                    params[params.length - 1] = statement.getMessage();

                    m = packageMap.get(key).getDeclaredMethod(statement.getActionTypeParams().get(0), methodParams);
                    m.setAccessible(true);
                    break;
                } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                    // method can not be in current package, continue search
                    m = null;
                    o = null;
                    params = null;
                    continue;
                }
            }

            if (m != null && o != null && params != null) {
                actionTask.setMethod(m);
                actionTask.setObject(o);
                actionTask.setParams(params);
                actionTask.setTitle(statement.getIdentifier());
                actionTask.setActive(false);
                actionTask.setTimeValues(statement, packageMap);
                notificationMap.put(statement.getIdentifier(), actionTask);
                notificationMap.get(statement.getIdentifier()).toggleNotification();
            } else {
                throw new IllegalStateException(statement.getActionTypeParams().get(0));
            }
        } else {
            throw new IllegalStateException("Bad entry for notification statement");
        }
    }

    private static Stream<String> readFile(String path) throws IOException {
        Path p = FileSystems.getDefault().getPath(path);
        return Files.lines(p);
    }

    private static Boolean resolveConditionExpression(ConditionExpression expression) {
        List<Boolean> factorValues = new ArrayList<>();
        expression.getTermList().forEach(t -> {
            t.getFactorList().forEach(f -> {
                if (f.getRelativeFactor() != null) {
                    RelativeFactor relativeFactor = f.getRelativeFactor();
                    Boolean result = resolveRelativeFactor(relativeFactor);
                    f.setValue(result);
                    factorValues.add(result);
                } else if (f.getInteger() != null) {
                    Boolean result = f.getInteger() > 0;
                    f.setValue(result);
                    factorValues.add(result);
                } else if (f.getIdentifier() != null) {
                    Boolean result;
                    if (variableMap.containsKey(f.getIdentifier())) {
                        try {
                            result = Integer.valueOf(variableMap.get(f.getIdentifier()).toString()) > 0;
                        } catch (NumberFormatException e) {
                            result = true;
                        }
                    } else {
                        throw new IllegalStateException(f.getIdentifier());
                    }
                    f.setValue(result);
                    factorValues.add(result);
                } else if (f.getArithmeticOperation() != null) {
                    Boolean result = Integer.valueOf(arithmeticOperation(f.getArithmeticOperation())) > 0;
                    f.setValue(result);
                    factorValues.add(result);
                } else if (f.getNotIdentifier() != null) {
                    Boolean result;
                    if (variableMap.containsKey(f.getIdentifier())) {
                        try {
                            result = !(Integer.valueOf(variableMap.get(f.getIdentifier()).toString()) > 0);
                        } catch (NumberFormatException e) {
                            result = false;
                        }
                    } else {
                        throw new IllegalStateException(f.getIdentifier());
                    }
                    f.setValue(result);
                    factorValues.add(result);
                } else if (f.getObjectProperties() != null) {
                    Boolean result;
                    String s = getObjectProperties(f.getObjectProperties());
                    if (s != null) {
                        result = true;
                    } else {
                        result = false;
                    }
                    f.setValue(result);
                    factorValues.add(result);
                }
                Boolean result = true;
                for (Boolean b : factorValues) {
                    if (!b) {
                        result = false;
                        break;
                    }
                }
                t.setValue(result);
            });
        });
        Boolean result = false;
        for (Term t : expression.getTermList()) {
            if (t.getValue()) {
                result = true;
                break;
            }
        }
        return result;
    }

    private static Boolean resolveRelativeFactor(RelativeFactor relativeFactor) {
        Integer val1 = null, val2 = null;
        if (relativeFactor.getLeftVariable() != null) {
            if (variableMap.containsKey(relativeFactor.getLeftVariable())) {
                try {
                    val1 = Integer.valueOf(variableMap.get(relativeFactor.getLeftVariable()).toString());
                } catch (NumberFormatException e) {
                    throw new IllegalStateException("Bad entry for relative factor - " + relativeFactor.getLeftVariable() + " is not a number");
                }
            }
        }
        if (relativeFactor.getLeftInteger() != null) {
            val1 = relativeFactor.getLeftInteger();
        }
        if (relativeFactor.getLeftArithmetic() != null) {
            val1 = Integer.valueOf(arithmeticOperation(relativeFactor.getLeftArithmetic()));
        }

        if (relativeFactor.getRightVariable() != null) {
            if (variableMap.containsKey(relativeFactor.getRightVariable())) {
                try {
                    val2 = Integer.valueOf(variableMap.get(relativeFactor.getRightVariable()).toString());
                } catch (NumberFormatException e) {
                    throw new IllegalStateException("Bad entry for relative factor - " + relativeFactor.getRightVariable() + " is not a number");
                }
            }
        }
        if (relativeFactor.getRightInteger() != null) {
            val2 = relativeFactor.getRightInteger();
        }
        if (relativeFactor.getRightArithmetic() != null) {
            val2 = Integer.valueOf(arithmeticOperation(relativeFactor.getRightArithmetic()));
        }
        Boolean result = false;
        if (relativeFactor.getOperatorType() != null && val1 != null && val2 != null) {
            switch (relativeFactor.getOperatorType()) {
                case LESS:
                    result = val1 < val2;
                    break;
                case MORE:
                    result = val1 > val2;
                    break;
                case EQUAL:
                    result = val1.equals(val2);
                    break;
                case NOT_EQUAL:
                    result = !val1.equals(val2);
                    break;
                case LESS_OR_EQUAL:
                    result = val1 <= val2;
                    break;
                case MORE_OR_EQUAL:
                    result = val1 >= val2;
                    break;
            }
        } else {
            throw new IllegalStateException("Bad entry for relative factor");
        }
        return result;
    }

    private static int searchFunction(SearchFunction statement) throws IllegalStateException {
        int value;
        if (statement.getParam() != null) {
            value = notificationMap.keySet().stream()
                    .map(n -> {
                        String param = statement.getParam();
                        param = StringUtil.removeQuotesAndDoubleQuotes(param);
                        if (n.equals(param)) {
                            System.out.println("ID = " + n + ", " + notificationMap.get(n).toString());
                        }
                        return n;
                    })
                    .collect(Collectors.toList()).size();
        } else {
            notificationMap.keySet().forEach(n -> {
                System.out.println("ID = " + n + ", " + notificationMap.get(n).toString());
            });
            value = notificationMap.keySet().size();
        }
        return value;
    }

    private static void serveInstructionList(List<Instruction> instructionList) {
        instructionList.forEach(i -> {
            if (i.getIfStatement() != null) {
                ifStatement(i.getIfStatement());
            } else if (i.getFunctionCall() != null) {
                functionCall(i.getFunctionCall());
            } else if (i.getNotificationStatement() != null) {
                notification(i.getNotificationStatement());
            } else if (i.getSearchFunction() != null) {
                searchFunction(i.getSearchFunction());
            } else if (i.getVariableOrAssignment() != null) {
                variableOrAssignment(i.getVariableOrAssignment());
            }
        });
    }

    private static void serveSource(String source) throws IllegalStateException {
        Script script;
        try {
            script = new ParserImpl().parse(source);
        } catch (NullPointerException e) {
            e.printStackTrace();
            throw new IllegalStateException("null pointer");
        }
        script.getStatementList().forEach(s -> {
            switch (s.getType()) {
                case FUNCTION_CALL:
                    functionCall((FunctionCall) s);
                    break;
                case IF_STATEMENT:
                    ifStatement((IfStatement) s);
                    break;
                case IMPORT_STATEMENT:
                    importPackage((ImportStatement) s);
                    break;
                case NOTIFICATION_STATEMENT:
                    notification((NotificationStatement) s);
                    break;
                case SEARCH_FUNCTION:
                    searchFunction((SearchFunction) s);
                    break;
                case VARIABLE_OR_ASSIGNMENT:
                    variableOrAssignment((VariableOrAssignment) s);
                    break;
            }
        });
    }

    private static void toggleAllNotifications() {
        notificationMap.keySet().forEach(k -> {
            BaseTask task = notificationMap.get(k);
            task.toggleNotification();
        });
    }

    private static void variableOrAssignment(VariableOrAssignment statement) throws IllegalStateException {
        String identifier = statement.getIdentifier();
        String value = "";
        if (statement.getBooleanValue() != null) {
            value = statement.getBooleanValue().toString();
        } else if (statement.getIntegerValue() != null) {
            value = statement.getIntegerValue().toString();
        } else if (statement.getVariableValue() != null) {
            if (statement.getVariableValue().equals("now")) {
                value = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date());
            } else {
                value = variableMap.get(statement.getVariableValue()).toString();
            }
        } else if (statement.getStringValue() != null) {
            value = statement.getStringValue();
        } else if (statement.getSearchFunction() != null) {
            value = String.valueOf(searchFunction(statement.getSearchFunction()));
        } else if (statement.getFunctionCall() != null) {
            value = String.valueOf(functionCall(statement.getFunctionCall()));
        } else if (statement.getObjectProperties() != null) {
            try {
                value = getObjectProperties(statement.getObjectProperties());
            } catch (IllegalStateException e) {
                throw e;
            }
        } else if (statement.getArithmeticOperation() != null) {
            try {
                value = arithmeticOperation(statement.getArithmeticOperation());
            } catch (Exception e) {
                throw e;
            }
        }
        variableMap.put(identifier, value);
    }
}
