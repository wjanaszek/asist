package pl.edu.pw.elka.wjanaszek.asist;

import pl.edu.pw.elka.wjanaszek.asist.domain.Script;
import pl.edu.pw.elka.wjanaszek.asist.domain.function.FunctionCall;
import pl.edu.pw.elka.wjanaszek.asist.domain.import_stat.ImportStatement;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.NotificationStatement;
import pl.edu.pw.elka.wjanaszek.asist.domain.search.SearchFunction;
import pl.edu.pw.elka.wjanaszek.asist.domain.variable.VariableOrAssignment;
import pl.edu.pw.elka.wjanaszek.asist.parser.ParserImpl;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AsistDemo {

    private static final Map<String, Object> functionMap = new HashMap<>();
    private static Map<String, NotificationTask> notificationMap = new HashMap<>();
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
                    System.err.println("No element " + e.getMessage() + " found");
                }
            }
        } else {
            System.err.println("Too many arguments");
        }
        System.exit(0);
    }

    private static void serveSource(String source) throws IllegalStateException {
        Script script = null;
        try {
            script = new ParserImpl().parse(source);
        } catch (NullPointerException e) {
            throw new IllegalStateException("unknown");
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

    private static void functionCall(FunctionCall statement) throws IllegalStateException {
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
                            s = s.replace("\'", "");
                            s = s.replace("\"", "");
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
                            NotificationTask task = notificationMap.get(k);
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
                            NotificationTask task = notificationMap.get(k);
                            task.toggleNotification();
                        });
        } else if (statement.getIdentifier().toLowerCase().equals("delete")) {
            if (statement.getParams() != null && statement.getParams().size() > 0 && statement.getParams().get(0).equals("all")) {
                notificationMap = new HashMap<>();
            } else if (statement.getParams() != null)
                notificationMap.entrySet().removeIf(n -> n.getKey().equals(statement.getParams().get(0)));
        } else {
            // @TODO do something package depended
        }
    }

    private static void notification(NotificationStatement statement) throws IllegalStateException {
        if (statement.getActionType().toLowerCase().equals("os_notification")) {
            // t.schedule(new NotificationTask(statement.getIdentifier(), statement.getMessage()), 0, 10 * 1000);
            notificationMap.put(statement.getIdentifier(), new NotificationTask(false, statement.getMessage(), statement.getIdentifier()));
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

    private static void searchFunction(SearchFunction statement) throws IllegalStateException {
        int value = 0;
        if (statement.getParam() != null) {
            value = notificationMap.keySet().stream().map(n -> {
                if (n.equals(statement.getParam())) {
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
    }

    private static void variableOrAssignment(VariableOrAssignment statement) throws IllegalStateException {
        String identifier = statement.getIdentifier();
        String value = "";
        if (statement.getBooleanValue() != null) {
            value = statement.getBooleanValue().toString();
        } else if (statement.getIntegerValue() != null) {
            value = statement.getIntegerValue().toString();
        } else if (statement.getVariableValue() != null) {
            value = variableMap.get(statement.getVariableValue()).toString();
        } else if (statement.getStringValue() != null) {
            value = statement.getStringValue();
        }
        variableMap.put(identifier, value);
    }

    private static void toggleAllNotifications() {
        notificationMap.keySet().forEach(k -> {
            NotificationTask task = notificationMap.get(k);
            task.toggleNotification();
        });
    }

}
