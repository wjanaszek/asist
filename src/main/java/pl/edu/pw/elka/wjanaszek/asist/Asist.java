package pl.edu.pw.elka.wjanaszek.asist;

import pl.edu.pw.elka.wjanaszek.asist.domain.Script;
import pl.edu.pw.elka.wjanaszek.asist.domain.function.FunctionCall;
import pl.edu.pw.elka.wjanaszek.asist.domain.if_stat.ConditionExpression;
import pl.edu.pw.elka.wjanaszek.asist.domain.if_stat.IfStatement;
import pl.edu.pw.elka.wjanaszek.asist.domain.if_stat.Instruction;
import pl.edu.pw.elka.wjanaszek.asist.domain.import_stat.ImportStatement;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.*;
import pl.edu.pw.elka.wjanaszek.asist.domain.search.SearchFunction;
import pl.edu.pw.elka.wjanaszek.asist.domain.task.BaseTask;
import pl.edu.pw.elka.wjanaszek.asist.domain.task.NotificationTask;
import pl.edu.pw.elka.wjanaszek.asist.domain.variable.*;
import pl.edu.pw.elka.wjanaszek.asist.parser.ParserImpl;
import pl.edu.pw.elka.wjanaszek.asist.utils.StringUtil;
import pl.edu.pw.elka.wjanaszek.asist.utils.TimeBasedValues;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Asist {

    private static Map<String, BaseTask> notificationMap = new HashMap<>();
    private static final Map<String, Object> packageMap = new HashMap<>();
    private static final Map<String, Object> variableMap = new HashMap<>();

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
                System.out.println("new value");
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
            System.out.println(values.get(0));
            return values.get(0);
        } else {
            throw new IllegalStateException("Bad arithmetic expression (4)");
        }
    }

    private static Object functionCall(FunctionCall statement) throws IllegalStateException {
        Object o = null;
        if (statement.getIdentifier().equals("print")) {
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
        } else if (statement.getIdentifier().toLowerCase().equals("turn_off")) {
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
        } else if (statement.getIdentifier().toLowerCase().equals("turn_on")) {
            if (statement.getParams() != null && statement.getParams().size() > 0 && statement.getParams().get(0).equals("all")) {
                toggleAllNotifications();
            } else if (statement.getParams() != null)
                notificationMap.keySet().stream()
                        .filter(k -> k.equals(statement.getParams().get(0)))
                        .forEach(k -> {
                            BaseTask task = notificationMap.get(k);
                            task.toggleNotification();
                        });
        } else if (statement.getIdentifier().toLowerCase().equals("delete")) {
            if (statement.getParams() != null && statement.getParams().size() > 0 && statement.getParams().get(0).equals("all")) {
                notificationMap = new HashMap<>();
            } else if (statement.getParams() != null && statement.getParams().size() > 0) {
                final String key = StringUtil.removeQuotesAndDoubleQuotes(statement.getParams().get(0));
                notificationMap.entrySet().removeIf(n -> n.getKey().equals(key));
            } else {
                throw new IllegalStateException("Bad entry for delete function");
            }
        } else {
            if (statement.getIdentifier() != null && packageMap.containsKey(statement.getIdentifier())) {
                // @TODO do something package depended
            } else if (statement.getIdentifier() != null && !packageMap.containsKey(statement.getIdentifier())) {
                throw new IllegalStateException(statement.getIdentifier());
            } else {
                throw new IllegalStateException("Bad function call entry");
            }
        }
        return o;
    }

    private static TimeBasedValues getTimeBasedValues(TimeBased timeBased) {
        TimeBasedValues timeBasedValues = new TimeBasedValues();
        Integer seconds = null, minutes = null, hours = null;
        if (timeBased.getPluralTimeType() != null) {
            seconds = timeBased.getPluralTimeType() == PluralTimeType.SECONDS ? timeBased.getValue()*1000 : null;
            minutes = timeBased.getPluralTimeType() == PluralTimeType.MINUTES ? timeBased.getValue()*60*1000 : null;
            hours = timeBased.getPluralTimeType() == PluralTimeType.HOURS ? timeBased.getValue()*60*60*1000 : null;
        } else if (timeBased.getSingleTimeType() != null) {
            seconds = timeBased.getSingleTimeType() == SingleTimeType.SECOND ? timeBased.getValue()*1000 : null;
            minutes = timeBased.getSingleTimeType() == SingleTimeType.MINUTE ? timeBased.getValue()*60*1000 : null;
            hours = timeBased.getSingleTimeType() == SingleTimeType.HOUR ? timeBased.getValue()*60*60*1000 : null;
        }
        timeBasedValues.setSeconds(seconds);
        timeBasedValues.setMinutes(minutes);
        timeBasedValues.setHours(hours);
        return timeBasedValues;
    }

    private static void handleIllegalStateException(IllegalStateException e) {
        if (e.getMessage().equals("unknown")) {
            System.err.println("Unknown error occured");
        } else if (e.getMessage().startsWith("Duplicate id")) {
            System.err.println(e.getMessage());
        } else if (e.getMessage().startsWith("Bad")) {
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
        if (!packageMap.containsKey(statement.getPackageName())) {
            packageMap.put(statement.getPackageName(), null);
        }
    }

    private static void notification(NotificationStatement statement) throws IllegalStateException {
        if (statement.getActionType().toLowerCase().equals("os_notification")) {
            if (notificationMap.containsKey(statement.getIdentifier())) {
                throw new IllegalStateException("Duplicate id " + statement.getIdentifier());
            }
            System.out.println("task to dispatch: " + statement.toString());
            NotificationTask task = new NotificationTask(
                    false,
                    statement.getMessage(),
                    statement.getIdentifier()
            );
            if (statement.getFiredWhen().getTimeBased().getType() != null) {
                TimeBased timeBased = statement.getFiredWhen().getTimeBased();
                TimeBasedValues timeBasedValues;
                if (statement.getFiredWhen().getTimeBased().getType() == TimeBasedType.IN) {
                    timeBasedValues = getTimeBasedValues(timeBased);
                    if (timeBasedValues.getSeconds() != null) {
                        task.setDelay(timeBasedValues.getSeconds());
                        task.setSeconds(timeBasedValues.getSeconds());
                    } else if (timeBasedValues.getMinutes() != null) {
                        task.setDelay(timeBasedValues.getMinutes());
                        task.setMinutes(timeBasedValues.getMinutes());
                    } else if (timeBasedValues.getHours() != null) {
                        task.setDelay(timeBasedValues.getHours());
                        task.setHours(timeBasedValues.getHours());
                    }
                } else if (statement.getFiredWhen().getTimeBased().getType() == TimeBasedType.EVERY) {
                    timeBasedValues = getTimeBasedValues(timeBased);
                    if (timeBasedValues.getSeconds() != null) {
                        task.setPeriod(timeBasedValues.getSeconds());
                        task.setSeconds(timeBasedValues.getSeconds());
                    } else if (timeBasedValues.getMinutes() != null) {
                        task.setPeriod(timeBasedValues.getMinutes());
                        task.setMinutes(timeBasedValues.getMinutes());
                    } else if (timeBasedValues.getHours() != null) {
                        task.setPeriod(timeBasedValues.getHours());
                        task.setHours(timeBasedValues.getHours());
                    }
                }
            } else if (statement.getFiredWhen().getTimePrecisely().getTime() != null) {
                TimePrecisely timePrecisely = statement.getFiredWhen().getTimePrecisely();
                String hour, minute, day, month, year, date = "", time = "";
                if (timePrecisely.getTime() != null) {
                    hour = timePrecisely.getTime().split("/")[0];
                    minute = timePrecisely.getTime().split("/")[1];
                    time = hour + ":" + minute + ":00";
                }
                if (timePrecisely.getDate() != null) {
                    day = timePrecisely.getDate().split("/")[0];
                    month = timePrecisely.getDate().split("/")[1];
                    year = timePrecisely.getDate().split("/")[2];
                    date = day + "-" + month + "-" + year;
                } else {
                    date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
                }
                date += " " + time;
                try {
                    task.setDate(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(date));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            } else if (statement.getFiredWhen().getOnEvent() != null) {
                for (String identifier : statement.getFiredWhen().getOnEvent().getIdentifier()) {
                    if (!packageMap.containsKey(identifier)) {
                        throw new IllegalStateException(identifier);
                    }
                }
            }
            notificationMap.put(statement.getIdentifier(), task);
            notificationMap.get(statement.getIdentifier()).toggleNotification();
        } else {
            String type = statement.getActionType().toLowerCase();
            if (packageMap.containsKey(type)) {
                // @TODO do something package-depended
            } else {
                throw new IllegalStateException(type);
            }
        }
    }

    private static Stream<String> readFile(String path) throws IOException {
        Path p = FileSystems.getDefault().getPath(path);
        return Files.lines(p);
    }

    private static Boolean resolveConditionExpression(ConditionExpression expression) {
        // @TODO implement this
        return true;
    }

    private static int searchFunction(SearchFunction statement) throws IllegalStateException {
        int value = 0;
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
            List<String> propertiesList = statement.getObjectProperties().getPropertiesList();
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
            } else if (propertiesList.size() > 0 && packageMap.containsKey(propertiesList.get(0))) {
                // @TODO then check if it's from some package
            } else {
                // else throw exception
                throw new IllegalStateException(propertiesList
                        .stream()
                        .collect(Collectors.joining(", ")));
            }
        } else if (statement.getArithmeticOperation() != null) {
            value = arithmeticOperation(statement.getArithmeticOperation());
        }
        variableMap.put(identifier, value);
    }
}
