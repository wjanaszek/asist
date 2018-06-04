package pl.edu.pw.elka.wjanaszek.asist.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.apache.commons.lang3.StringUtils;
import pl.edu.pw.elka.wjanaszek.asist.domain.Script;
import pl.edu.pw.elka.wjanaszek.asist.domain.Statement;
import pl.edu.pw.elka.wjanaszek.asist.domain.function.FunctionCall;
import pl.edu.pw.elka.wjanaszek.asist.domain.if_stat.*;
import pl.edu.pw.elka.wjanaszek.asist.domain.import_stat.ImportStatement;
import pl.edu.pw.elka.wjanaszek.asist.domain.notification.*;
import pl.edu.pw.elka.wjanaszek.asist.domain.search.SearchFunction;
import pl.edu.pw.elka.wjanaszek.asist.domain.variable.*;
import pl.edu.pw.elka.wjanaszek.asist.generated.AsistBaseVisitor;
import pl.edu.pw.elka.wjanaszek.asist.generated.AsistLexer;
import pl.edu.pw.elka.wjanaszek.asist.generated.AsistParser;
import pl.edu.pw.elka.wjanaszek.asist.utils.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParserImpl implements Parser {
    public Script parse(String code) {
        CharStream charStream = new ANTLRInputStream(code);
        AsistLexer lexer = new AsistLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        AsistParser parser = new AsistParser(tokens);

        ScriptVisitor scriptVisitor = new ScriptVisitor();
        Script traverseResult = scriptVisitor.visit(parser.script());
        return traverseResult;
    }

    private static class ScriptVisitor extends AsistBaseVisitor<Script> {

        public Script visitScript(AsistParser.ScriptContext ctx) {
            StatementVisitor statementVisitor = new StatementVisitor();
            List<Statement> statementList = ctx.statement()
                    .stream()
                    .map(statement -> statement.accept(statementVisitor))
                    .collect(Collectors.toList());
            return new Script(statementList);
        }
    }

    private static class StatementVisitor extends AsistBaseVisitor<Statement> {

        public Statement visitStatement(AsistParser.StatementContext ctx) {
            if (ctx.importStatement() != null) {
                ImportStatementVisitor importStatementVisitor = new ImportStatementVisitor();
                return importStatementVisitor.visitImportStatement(ctx.importStatement());
            } else if (ctx.notificationStatement() != null) {
                NotificationStatementVisitor notificationStatementVisitor = new NotificationStatementVisitor();
                return notificationStatementVisitor.visitNotificationStatement(ctx.notificationStatement());
            } else if (ctx.variableOrAssignment() != null) {
                VariableOrAssignmentVisitor variableOrAssignmentVisitor = new VariableOrAssignmentVisitor();
                return variableOrAssignmentVisitor.visitVariableOrAssignment(ctx.variableOrAssignment());
            } else if (ctx.functionCall() != null) {
                FunctionCallVisitor functionCallVisitor = new FunctionCallVisitor();
                return functionCallVisitor.visitFunctionCall(ctx.functionCall());
            } else if (ctx.ifStatement() != null) {
                IfStatementVisitor ifStatementVisitor = new IfStatementVisitor();
                return ifStatementVisitor.visitIfStatement(ctx.ifStatement());
            } else if (ctx.searchFunction() != null) {
                SearchFunctionVisitor searchFunctionVisitor = new SearchFunctionVisitor();
                return searchFunctionVisitor.visitSearchFunction(ctx.searchFunction());
            } else {
                throw new IllegalStateException("Not recognized statement");
            }
        }
    }

    private static class ImportStatementVisitor extends AsistBaseVisitor<ImportStatement> {

        public ImportStatement visitImportStatement(AsistParser.ImportStatementContext ctx) {
            return ctx.IDENTIFIER() != null ? new ImportStatement(ctx.IDENTIFIER().getText()) : null;
        }
    }

    private static class NotificationStatementVisitor extends AsistBaseVisitor<NotificationStatement> {

        public NotificationStatement visitNotificationStatement(AsistParser.NotificationStatementContext ctx) {
            String identifier = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;
            if (identifier == null) {
                return null;
            }
            TimeBased timeBased = new TimeBased();
            TimePrecisely timePrecisely = new TimePrecisely();
            OnEvent onEvent = new OnEvent();
            if (ctx.firedWhen().timeBased() != null) {
                AsistParser.FiredWhenContext c = ctx.firedWhen();
                if (c.timeBased().pluralTime() != null) {
                    if (c.timeBased().in() != null) {
                        timeBased.setType(TimeBasedType.IN);
                    } else if (c.timeBased().every() != null) {
                        timeBased.setType(TimeBasedType.EVERY);
                    }
                    if (c.timeBased().pluralTime().seconds() != null) {
                        timeBased.setPluralTimeType(PluralTimeType.SECONDS);
                    } else if (c.timeBased().pluralTime().minutes() != null) {
                        timeBased.setPluralTimeType(PluralTimeType.MINUTES);
                    } else if (c.timeBased().pluralTime().hours() != null) {
                        timeBased.setPluralTimeType(PluralTimeType.HOURS);
                    }
                    timeBased.setValue(Integer.valueOf(c.timeBased().pluralTime().INTEGER_NUMBER().getText()));
                } else if (c.timeBased().singleTime() != null) {
                    if (c.timeBased().in() != null) {
                        timeBased.setType(TimeBasedType.IN);
                    } else if (c.timeBased().every() != null) {
                        timeBased.setType(TimeBasedType.EVERY);
                    }
                    if (c.timeBased().singleTime().second() != null) {
                        timeBased.setSingleTimeType(SingleTimeType.SECOND);
                    } else if (c.timeBased().singleTime().minute() != null) {
                        timeBased.setSingleTimeType(SingleTimeType.MINUTE);
                    } else if (c.timeBased().singleTime().hour() != null) {
                        timeBased.setSingleTimeType(SingleTimeType.HOUR);
                    }
                    timeBased.setValue(1);
                }
            } else if (ctx.firedWhen().timePrecisely() != null) {
                if (ctx.firedWhen().timePrecisely().DATE() != null) {
                    timePrecisely.setDate(ctx.firedWhen().timePrecisely().DATE().getText());
                }
                if (ctx.firedWhen().timePrecisely().TIME() != null) {
                    timePrecisely.setTime(ctx.firedWhen().timePrecisely().TIME().getText());
                }
            } else if (ctx.firedWhen().onEvent() != null) {
                onEvent.setIdentifier(ctx.firedWhen().onEvent().IDENTIFIER()
                        .stream()
                        .map(i -> i.getText())
                        .collect(Collectors.toList()));
            }
            FiredWhen firedWhen = new FiredWhen(timeBased, timePrecisely, onEvent);
            String message = ctx.STRING() != null ? ctx.STRING().getText() : null;
            List<String> actionTypeParams = null;
            if (ctx.actionType() != null) {
                if (ctx.actionType().IDENTIFIER().size() >= 1) {
                    actionTypeParams = ctx.actionType().IDENTIFIER().stream()
                            .map(i -> i.getText())
                            .collect(Collectors.toList());
                }
            }
            return new NotificationStatement(identifier, firedWhen, message, actionTypeParams);
        }
    }

    private static class VariableOrAssignmentVisitor extends AsistBaseVisitor<VariableOrAssignment> {

        public VariableOrAssignment visitVariableOrAssignment(AsistParser.VariableOrAssignmentContext ctx) {
            if (ctx.variable() != null) {
                return new VariableOrAssignment(ctx.variable().IDENTIFIER().getText());
            } else if (ctx.variableAssignment() != null) {
                VariableOrAssignment variableOrAssignment = new VariableOrAssignment();
                if (ctx.variableAssignment().IDENTIFIER() != null) {
                    variableOrAssignment.setIdentifier(ctx.variableAssignment().IDENTIFIER().getText());
                }
                AsistParser.ExpressionContext c = ctx.variableAssignment().expression();
                if (c.assignVariable() != null) {
                    variableOrAssignment.setVariableValue(c.assignVariable().getText());
                } else if (c.STRING() != null) {
                    variableOrAssignment.setStringValue(c.STRING().getText());
                } else if (c.INTEGER_NUMBER() != null) {
                    variableOrAssignment.setIntegerValue(Integer.valueOf(c.INTEGER_NUMBER().getText()));
                } else if (c.booleanExpression() != null) {
                    variableOrAssignment.setBooleanValue(Boolean.valueOf(c.booleanExpression().getText()));
                } else if (c.searchFunction() != null) {
                    SearchFunctionVisitor searchFunctionVisitor = new SearchFunctionVisitor();
                    variableOrAssignment.setSearchFunction(searchFunctionVisitor.visitSearchFunction(c.searchFunction()));
                } else if (c.objectProperties() != null) {
                    variableOrAssignment.setObjectProperties(objectPropertiesVisitor(c.objectProperties()));
                } else if (c.arithmeticOperation() != null) {
                    variableOrAssignment.setArithmeticOperation(arithmeticOperationVisitor(c.arithmeticOperation()));
                } else if (c.functionCall() != null) {
                    FunctionCallVisitor functionCallVisitor = new FunctionCallVisitor();
                    variableOrAssignment.setFunctionCall(functionCallVisitor.visitFunctionCall(c.functionCall()));
                }
                return variableOrAssignment;
            } else {
                throw new IllegalStateException("Variable do not parsed");
            }
        }
    }

    private static class FunctionCallVisitor extends AsistBaseVisitor<FunctionCall> {

        public FunctionCall visitFunctionCall(AsistParser.FunctionCallContext ctx) {
            String identifier = ctx.IDENTIFIER() != null ? ctx.IDENTIFIER().getText() : null;
            if (identifier == null) {
                return null;
            }
            List<String> params = new ArrayList<>();
            if (ctx.params() != null && ctx.params().children != null) {
                params = ctx.params().children
                        .stream()
                        .map(i -> StringUtil.removeQuotesAndDoubleQuotes(i.getText()))
                        .collect(Collectors.toList());
            }
            return new FunctionCall(identifier, params);
        }
    }

    private static class IfStatementVisitor extends AsistBaseVisitor<IfStatement> {

        public IfStatement visitIfStatement(AsistParser.IfStatementContext ctx) {
            ConditionExpression conditionExpression = new ConditionExpression();
            List<Instruction> ifInstructions = new ArrayList<>();
            List<Instruction> elseInstructions = new ArrayList<>();
            if (ctx.conditionExpression() != null && ctx.conditionExpression().term() != null) {
                conditionExpression.setTermList(ctx.conditionExpression().term()
                        .stream()
                        .map(i -> {
                            Term term = new Term();
                            term.setFactorList(i.factor().stream()
                                    .map(f -> {
                                        Factor factor = new Factor();
                                        if (f.objectProperties() != null) {
                                            factor.setObjectProperties(objectPropertiesVisitor(f.objectProperties()));
                                        } else if (f.INTEGER_NUMBER() != null) {
                                            factor.setInteger(Integer.valueOf(f.INTEGER_NUMBER().getText()));
                                        } else if (f.variable() != null) {
                                            factor.setIdentifier(f.variable().getText());
                                        } else if (f.arithmeticOperation() != null) {
                                            factor.setArithmeticOperation(arithmeticOperationVisitor(f.arithmeticOperation()));
                                        } else if (f.notVariable() != null) {
                                            factor.setNotIdentifier(f.notVariable().variable().getText());
                                        } else if (f.relativeFactor() != null) {
                                            RelativeFactor relativeFactor = resolveFactor(f.relativeFactor());
                                            factor.setRelativeFactor(relativeFactor);
                                        }
                                        return factor;
                                    })
                                    .collect(Collectors.toList()));
                            return term;
                        })
                        .collect(Collectors.toList()));
            }
            if (ctx.ifInstructions() != null) {
                ifInstructions = ctx.ifInstructions().instruction()
                        .stream()
                        .map(i -> mapToInstruction(i))
                        .collect(Collectors.toList());
            }
            if (ctx.elseInstructions() != null) {
                elseInstructions = ctx.elseInstructions().instruction()
                        .stream()
                        .map(i -> mapToInstruction(i))
                        .collect(Collectors.toList());
            }
            return new IfStatement(conditionExpression, ifInstructions, elseInstructions);
        }

        private static RelativeFactor resolveFactor(AsistParser.RelativeFactorContext ctx) {
            RelativeFactor relativeFactor = new RelativeFactor();
            if (ctx.relativeArithmeticArithmetic() != null) {
                relativeFactor.setOperatorType(RelativeOperatorType.fromString(ctx.relativeArithmeticArithmetic().RELATIVE_OPERATOR().getText()));
                relativeFactor.setLeftArithmetic(arithmeticOperationVisitor(ctx.relativeArithmeticArithmetic().arithmeticOperation(0)));
                relativeFactor.setRightArithmetic(arithmeticOperationVisitor(ctx.relativeArithmeticArithmetic().arithmeticOperation(1)));
            } else if (ctx.relativeArithmeticInteger() != null) {
                relativeFactor.setOperatorType(RelativeOperatorType.fromString(ctx.relativeArithmeticInteger().RELATIVE_OPERATOR().getText()));
                relativeFactor.setLeftArithmetic(arithmeticOperationVisitor(ctx.relativeArithmeticInteger().arithmeticOperation()));
                relativeFactor.setRightInteger(Integer.valueOf(ctx.relativeArithmeticInteger().INTEGER_NUMBER().getText()));
            } else if (ctx.relativeArithmeticVariable() != null) {
                relativeFactor.setOperatorType(RelativeOperatorType.fromString(ctx.relativeArithmeticVariable().RELATIVE_OPERATOR().getText()));
                relativeFactor.setLeftArithmetic(arithmeticOperationVisitor(ctx.relativeArithmeticVariable().arithmeticOperation()));
                relativeFactor.setRightVariable((ctx.relativeArithmeticVariable().variable().getText()));
            } else if (ctx.relativeIntegerArithmetic() != null) {
                relativeFactor.setOperatorType(RelativeOperatorType.fromString(ctx.relativeIntegerArithmetic().RELATIVE_OPERATOR().getText()));
                relativeFactor.setLeftInteger(Integer.valueOf(ctx.relativeIntegerArithmetic().INTEGER_NUMBER().getText()));
                relativeFactor.setRightArithmetic(arithmeticOperationVisitor(ctx.relativeIntegerArithmetic().arithmeticOperation()));
            } else if (ctx.relativeIntegerInteger() != null) {
                relativeFactor.setOperatorType(RelativeOperatorType.fromString(ctx.relativeIntegerInteger().RELATIVE_OPERATOR().getText()));
                relativeFactor.setLeftInteger(Integer.valueOf(ctx.relativeIntegerInteger().INTEGER_NUMBER(0).getText()));
                relativeFactor.setRightInteger(Integer.valueOf(ctx.relativeIntegerInteger().INTEGER_NUMBER(1).getText()));
            } else if (ctx.relativeIntegerVariable() != null) {
                relativeFactor.setOperatorType(RelativeOperatorType.fromString(ctx.relativeIntegerVariable().RELATIVE_OPERATOR().getText()));
                relativeFactor.setLeftInteger(Integer.valueOf(ctx.relativeIntegerVariable().INTEGER_NUMBER().getText()));
                relativeFactor.setRightVariable(ctx.relativeIntegerVariable().variable().getText());
            } else if (ctx.relativeVariableArithmetic() != null) {
                relativeFactor.setOperatorType(RelativeOperatorType.fromString(ctx.relativeVariableArithmetic().RELATIVE_OPERATOR().getText()));
                relativeFactor.setLeftVariable(ctx.relativeVariableArithmetic().variable().getText());
                relativeFactor.setRightArithmetic(arithmeticOperationVisitor(ctx.relativeVariableArithmetic().arithmeticOperation()));
            } else if (ctx.relativeVariableVariable() != null) {
                relativeFactor.setOperatorType(RelativeOperatorType.fromString(ctx.relativeVariableVariable().RELATIVE_OPERATOR().getText()));
                relativeFactor.setLeftVariable(ctx.relativeVariableVariable().variable(0).getText());
                relativeFactor.setRightVariable(ctx.relativeVariableVariable().variable(1).getText());
            } else if (ctx.relativeVariableInteger() != null) {
                relativeFactor.setOperatorType(RelativeOperatorType.fromString(ctx.relativeVariableInteger().RELATIVE_OPERATOR().getText()));
                relativeFactor.setLeftVariable(ctx.relativeVariableInteger().variable().getText());
                relativeFactor.setRightInteger(Integer.valueOf(ctx.relativeVariableInteger().INTEGER_NUMBER().getText()));
            }
            return relativeFactor;
        }
    }

    private static class SearchFunctionVisitor extends AsistBaseVisitor<SearchFunction> {

        public SearchFunction visitSearchFunction(AsistParser.SearchFunctionContext ctx) {
            String param = null;
            if (ctx.STRING() != null) {
                param = ctx.STRING().getText();
            }
            return new SearchFunction(param);
        }
    }

    private static ArithmeticOperation arithmeticOperationVisitor(AsistParser.ArithmeticOperationContext ctx) {
        List<MultiplyExpression> multiplyExpressionList = new ArrayList<>();
        for (AsistParser.MultiplyExpressionContext context : ctx.additionExpression().multiplyExpression()) {
            MultiplyExpression multiplyExpression = new MultiplyExpression();
            // atom expression list for current multiply expression
            multiplyExpression.setAtomExpressionList(context.atomExpression()
                    .stream()
                    .map(a -> StringUtils.isNumeric(a.getText()) ? new AtomExpression(null, Integer.valueOf(a.getText()))
                            : new AtomExpression(a.getText(), null))
                    .collect(Collectors.toList()));
            // operator list for current multiply expression
            multiplyExpression.setOperatorList(context.MULTIPLICATION_OPERATOR()
                    .stream()
                    .map(o -> MultiplicationOperator.fromString(o.getText()))
                    .collect(Collectors.toList()));
            multiplyExpressionList.add(multiplyExpression);
        }
        List<AdditionOperator> additionOperatorList = ctx.additionExpression().ADDITION_OPERATOR()
                .stream()
                .map(o -> AdditionOperator.fromString(o.getText()))
                .collect(Collectors.toList());
        return new ArithmeticOperation(multiplyExpressionList, additionOperatorList, "0");
    }

    private static ObjectProperties objectPropertiesVisitor(AsistParser.ObjectPropertiesContext ctx) {
        List<String> properties = Stream.of(ctx.OBJECT_PROPERTIES()
                .getText()
                .split("\\."))
                .collect(Collectors.toList());
        return new ObjectProperties(properties);
    }

    private static Instruction mapToInstruction(AsistParser.InstructionContext ctx) {
        Instruction instruction = new Instruction();
        if (ctx.searchFunction() != null) {
            SearchFunctionVisitor searchFunctionVisitor = new SearchFunctionVisitor();
            instruction.setSearchFunction(searchFunctionVisitor.visitSearchFunction(ctx.searchFunction()));
        } else if (ctx.variableOrAssignment() != null) {
            VariableOrAssignmentVisitor variableOrAssignmentVisitor = new VariableOrAssignmentVisitor();
            instruction.setVariableOrAssignment(variableOrAssignmentVisitor.visitVariableOrAssignment(ctx.variableOrAssignment()));
        } else if (ctx.ifStatement() != null) {
            IfStatementVisitor ifStatementVisitor = new IfStatementVisitor();
            instruction.setIfStatement(ifStatementVisitor.visitIfStatement(ctx.ifStatement()));
        } else if (ctx.notificationStatement() != null) {
            NotificationStatementVisitor notificationStatementVisitor = new NotificationStatementVisitor();
            instruction.setNotificationStatement(notificationStatementVisitor.visitNotificationStatement(ctx.notificationStatement()));
        } else if (ctx.functionCall() != null) {
            FunctionCallVisitor functionCallVisitor = new FunctionCallVisitor();
            instruction.setFunctionCall(functionCallVisitor.visitFunctionCall(ctx.functionCall()));
        }
        return instruction;
    }
}
