package pl.edu.pw.elka.wjanaszek.asist;

import pl.edu.pw.elka.wjanaszek.asist.domain.Script;
import pl.edu.pw.elka.wjanaszek.asist.domain.function.FunctionCall;
import pl.edu.pw.elka.wjanaszek.asist.domain.import_stat.ImportStatement;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.*;
import pl.edu.pw.elka.wjanaszek.asist.domain.search.SearchFunction;
import pl.edu.pw.elka.wjanaszek.asist.domain.task.BaseTask;
import pl.edu.pw.elka.wjanaszek.asist.domain.task.NotificationTask;
import pl.edu.pw.elka.wjanaszek.asist.domain.variable.VariableOrAssignment;
import pl.edu.pw.elka.wjanaszek.asist.parser.ParserImpl;
import pl.edu.pw.elka.wjanaszek.asist.utils.StringUtil;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AsistDemo {

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
                System.err.println("No element " + e.getMessage() + " found");
            }
        } else if (args.length == 0) {
            Scanner scanner = new Scanner(System.in);
            String source;
            while (!scanner.hasNext("quit")) {
                source = scanner.nextLine();
                try {
                    serveSource(source);
                } catch (IllegalStateException e) {
                    if (e.getMessage().equals("unknown")) {
                        System.err.println("Unknown error occured");
                    } else if (e.getMessage().startsWith("Duplicate id")) {
                        System.err.println(e.getMessage());
                    } else {
                        System.err.println("No element " + e.getMessage() + " found");
                    }
                }
            }
        } else {
            System.err.println("Too many arguments");
        }
    }

    private static void serveSource(String source) throws IllegalStateException {
        Script script = null;
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

    private static Stream<String> readFile(String path) throws IOException {
        Path p = FileSystems.getDefault().getPath(path);
        return Files.lines(p);
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
                            s = StringUtil.removeQuotesAndDoubleQuotes(s);
                            return s;
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
            // @TODO do something package depended
        }
        return o;
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
                Integer seconds = null;
                Integer minutes = null;
                Integer hours = null;
                TimeBased timeBased = statement.getFiredWhen().getTimeBased();
                if (statement.getFiredWhen().getTimeBased().getType() == TimeBasedType.IN) {
                    if (timeBased.getPluralTimeType() != null) {
                        seconds = timeBased.getPluralTimeType() == PluralTimeType.SECONDS ? timeBased.getValue() * 1000 : null;
                        minutes = timeBased.getPluralTimeType() == PluralTimeType.MINUTES ? timeBased.getValue() * 60 * 1000 : null;
                        hours = timeBased.getPluralTimeType() == PluralTimeType.HOURS ? timeBased.getValue() * 60 * 60 * 1000 : null;
                    } else if (timeBased.getSingleTimeType() != null) {
                        seconds = timeBased.getSingleTimeType() == SingleTimeType.SECOND ? timeBased.getValue() * 1000 : null;
                        minutes = timeBased.getSingleTimeType() == SingleTimeType.MINUTE ? timeBased.getValue() * 60 * 1000 : null;
                        hours = timeBased.getSingleTimeType() == SingleTimeType.HOUR ? timeBased.getValue() * 60 * 60 * 1000 : null;
                    }
                    if (seconds != null) {
                        task.setDelay(seconds);
                        task.setSeconds(seconds);
                    } else if (minutes != null) {
                        task.setDelay(minutes);
                        task.setMinutes(minutes);
                    } else if (hours != null) {
                        task.setDelay(hours);
                        task.setHours(hours);
                    }
                } else if (statement.getFiredWhen().getTimeBased().getType() == TimeBasedType.EVERY) {
                    if (timeBased.getPluralTimeType() != null) {
                        seconds = timeBased.getPluralTimeType() == PluralTimeType.SECONDS ? timeBased.getValue() * 1000 : null;
                        minutes = timeBased.getPluralTimeType() == PluralTimeType.MINUTES ? timeBased.getValue() * 60 * 1000 : null;
                        hours = timeBased.getPluralTimeType() == PluralTimeType.HOURS ? timeBased.getValue() * 60 * 60 * 1000 : null;
                    } else if (timeBased.getSingleTimeType() != null) {
                        seconds = timeBased.getSingleTimeType() == SingleTimeType.SECOND ? timeBased.getValue() * 1000 : null;
                        minutes = timeBased.getSingleTimeType() == SingleTimeType.MINUTE ? timeBased.getValue() * 60 * 1000 : null;
                        hours = timeBased.getSingleTimeType() == SingleTimeType.HOUR ? timeBased.getValue() * 60 * 60 * 1000 : null;
                    }
                    if (seconds != null) {
                        task.setPeriod(seconds);
                        task.setSeconds(seconds);
                    } else if (minutes != null) {
                        task.setPeriod(minutes);
                        task.setMinutes(minutes);
                    } else if (hours != null) {
                        task.setPeriod(hours);
                        task.setHours(hours);
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
                // do something package-depended
            } else {
                throw new IllegalStateException(type);
            }
        }
    }

    private static void importPackage(ImportStatement statement) throws IllegalStateException {
        if (!packageMap.containsKey(statement.getPackageName())) {
            packageMap.put(statement.getPackageName(), null);
        }
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
                // then check if it's from some package
            } else {
                // else throw exception
                throw new IllegalStateException("unknown");
            }
        } else if (statement.getArithmeticOperation() != null) {
//            ArithmeticOperation a = statement.getArithmeticOperation();
//            List<MultiplyExpression> multiplyExpressionList = a.getMultiplyExpressionList();
//            List<AdditionOperator> additionOperatorList = a.getOperatorList();
//
//            for (MultiplyExpression exp : multiplyExpressionList) {
//                List<Integer> resultList = new ArrayList<>();
//                if (exp.getAtomExpressionList().size() == exp.getOperatorList().size() + 1) {
//                    List<Integer> tmpResult = new ArrayList<>();
//                    for (AtomExpression atomExpression : exp.getAtomExpressionList()) {
//                        if (atomExpression.getIdentifier() != null && variableMap.containsKey(atomExpression.getIdentifier())) {
//                            tmpResult.add(Integer.valueOf(variableMap.get(atomExpression.getIdentifier()).toString()));
//                        } else if (atomExpression.getValue() != null) {
//                            tmpResult.add(atomExpression.getValue());
//                        } else {
//                            throw new IllegalStateException(atomExpression.getIdentifier());
//                        }
//                    }
//                    int v = 1;
//                    if (tmpResult.size() > 1) {
//                        for (int i = 0; i < tmpResult.size(); i++) {
//                            int j = i;
//                            if (exp.getOperatorList().get(j) != null) {
//                                switch (exp.getOperatorList().get(j)) {
//                                    case DIVIDE:
//                                        v = tmpResult.get(i) / tmpResult.get(i + 1);
//                                        break;
//                                    case MULTIPLY:
//                                        v = tmpResult.get(i) * tmpResult.get(i + 1);
//                                        break;
//                                }
//                            }
//                        }
//                    } else {
//                        resultList.add(tmpResult.get(0));
//                    }
//                } else {
//                    throw new IllegalStateException("not valid multiply expression list");
//                }
//            }
        }
        variableMap.put(identifier, value);
    }

    private static void toggleAllNotifications() {
        notificationMap.keySet().forEach(k -> {
            BaseTask task = notificationMap.get(k);
            task.toggleNotification();
        });
    }

    private static void timeBasedValues(TimeBased timeBased, Integer seconds, Integer minutes, Integer hours) {
//        if (timeBased.getPluralTimeType() != null) {
//            seconds = timeBased.getPluralTimeType() == PluralTimeType.SECONDS ? timeBased.getValue()*1000 : null;
//            minutes = timeBased.getPluralTimeType() == PluralTimeType.MINUTES ? timeBased.getValue()*60*1000 : null;
//            hours = timeBased.getPluralTimeType() == PluralTimeType.HOURS ? timeBased.getValue()*60*60*1000 : null;
//        } else if (timeBased.getSingleTimeType() != null) {
//            seconds = timeBased.getSingleTimeType() == SingleTimeType.SECOND ? timeBased.getValue()*1000 : null;
//            minutes = timeBased.getSingleTimeType() == SingleTimeType.MINUTE ? timeBased.getValue()*60*1000 : null;
//            hours = timeBased.getSingleTimeType() == SingleTimeType.HOUR ? timeBased.getValue()*60*60*1000 : null;
//        }
    }
}
