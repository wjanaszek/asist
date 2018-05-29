// Generated from /Users/wjanaszek/Workspace/IdeaProjects/asist/src/main/antlr4/Asist.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AsistParser}.
 */
public interface AsistListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AsistParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(AsistParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(AsistParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AsistParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AsistParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AsistParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AsistParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#notificationStatement}.
	 * @param ctx the parse tree
	 */
	void enterNotificationStatement(AsistParser.NotificationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#notificationStatement}.
	 * @param ctx the parse tree
	 */
	void exitNotificationStatement(AsistParser.NotificationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#firedWhen}.
	 * @param ctx the parse tree
	 */
	void enterFiredWhen(AsistParser.FiredWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#firedWhen}.
	 * @param ctx the parse tree
	 */
	void exitFiredWhen(AsistParser.FiredWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#timeBased}.
	 * @param ctx the parse tree
	 */
	void enterTimeBased(AsistParser.TimeBasedContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#timeBased}.
	 * @param ctx the parse tree
	 */
	void exitTimeBased(AsistParser.TimeBasedContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#singleTime}.
	 * @param ctx the parse tree
	 */
	void enterSingleTime(AsistParser.SingleTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#singleTime}.
	 * @param ctx the parse tree
	 */
	void exitSingleTime(AsistParser.SingleTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#pluralTime}.
	 * @param ctx the parse tree
	 */
	void enterPluralTime(AsistParser.PluralTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#pluralTime}.
	 * @param ctx the parse tree
	 */
	void exitPluralTime(AsistParser.PluralTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#actionType}.
	 * @param ctx the parse tree
	 */
	void enterActionType(AsistParser.ActionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#actionType}.
	 * @param ctx the parse tree
	 */
	void exitActionType(AsistParser.ActionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#timePrecisely}.
	 * @param ctx the parse tree
	 */
	void enterTimePrecisely(AsistParser.TimePreciselyContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#timePrecisely}.
	 * @param ctx the parse tree
	 */
	void exitTimePrecisely(AsistParser.TimePreciselyContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#onEvent}.
	 * @param ctx the parse tree
	 */
	void enterOnEvent(AsistParser.OnEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#onEvent}.
	 * @param ctx the parse tree
	 */
	void exitOnEvent(AsistParser.OnEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#every}.
	 * @param ctx the parse tree
	 */
	void enterEvery(AsistParser.EveryContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#every}.
	 * @param ctx the parse tree
	 */
	void exitEvery(AsistParser.EveryContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#in}.
	 * @param ctx the parse tree
	 */
	void enterIn(AsistParser.InContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#in}.
	 * @param ctx the parse tree
	 */
	void exitIn(AsistParser.InContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#second}.
	 * @param ctx the parse tree
	 */
	void enterSecond(AsistParser.SecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#second}.
	 * @param ctx the parse tree
	 */
	void exitSecond(AsistParser.SecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#seconds}.
	 * @param ctx the parse tree
	 */
	void enterSeconds(AsistParser.SecondsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#seconds}.
	 * @param ctx the parse tree
	 */
	void exitSeconds(AsistParser.SecondsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#minute}.
	 * @param ctx the parse tree
	 */
	void enterMinute(AsistParser.MinuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#minute}.
	 * @param ctx the parse tree
	 */
	void exitMinute(AsistParser.MinuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#minutes}.
	 * @param ctx the parse tree
	 */
	void enterMinutes(AsistParser.MinutesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#minutes}.
	 * @param ctx the parse tree
	 */
	void exitMinutes(AsistParser.MinutesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#hour}.
	 * @param ctx the parse tree
	 */
	void enterHour(AsistParser.HourContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#hour}.
	 * @param ctx the parse tree
	 */
	void exitHour(AsistParser.HourContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#hours}.
	 * @param ctx the parse tree
	 */
	void enterHours(AsistParser.HoursContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#hours}.
	 * @param ctx the parse tree
	 */
	void exitHours(AsistParser.HoursContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#variableOrAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableOrAssignment(AsistParser.VariableOrAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#variableOrAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableOrAssignment(AsistParser.VariableOrAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(AsistParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(AsistParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(AsistParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(AsistParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AsistParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AsistParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#assignVariable}.
	 * @param ctx the parse tree
	 */
	void enterAssignVariable(AsistParser.AssignVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#assignVariable}.
	 * @param ctx the parse tree
	 */
	void exitAssignVariable(AsistParser.AssignVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(AsistParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(AsistParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#searchFunction}.
	 * @param ctx the parse tree
	 */
	void enterSearchFunction(AsistParser.SearchFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#searchFunction}.
	 * @param ctx the parse tree
	 */
	void exitSearchFunction(AsistParser.SearchFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#objectProperties}.
	 * @param ctx the parse tree
	 */
	void enterObjectProperties(AsistParser.ObjectPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#objectProperties}.
	 * @param ctx the parse tree
	 */
	void exitObjectProperties(AsistParser.ObjectPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperation(AsistParser.ArithmeticOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperation(AsistParser.ArithmeticOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditionExpression(AsistParser.AdditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#additionExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditionExpression(AsistParser.AdditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#multiplyExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(AsistParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#multiplyExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(AsistParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpression(AsistParser.AtomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#atomExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpression(AsistParser.AtomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(AsistParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(AsistParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(AsistParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(AsistParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AsistParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AsistParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#ifInstructions}.
	 * @param ctx the parse tree
	 */
	void enterIfInstructions(AsistParser.IfInstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#ifInstructions}.
	 * @param ctx the parse tree
	 */
	void exitIfInstructions(AsistParser.IfInstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#elseInstructions}.
	 * @param ctx the parse tree
	 */
	void enterElseInstructions(AsistParser.ElseInstructionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#elseInstructions}.
	 * @param ctx the parse tree
	 */
	void exitElseInstructions(AsistParser.ElseInstructionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(AsistParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(AsistParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionExpression(AsistParser.ConditionExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#conditionExpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionExpression(AsistParser.ConditionExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(AsistParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(AsistParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(AsistParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(AsistParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#relativeFactor}.
	 * @param ctx the parse tree
	 */
	void enterRelativeFactor(AsistParser.RelativeFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#relativeFactor}.
	 * @param ctx the parse tree
	 */
	void exitRelativeFactor(AsistParser.RelativeFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#relativeArithmeticArithmetic}.
	 * @param ctx the parse tree
	 */
	void enterRelativeArithmeticArithmetic(AsistParser.RelativeArithmeticArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#relativeArithmeticArithmetic}.
	 * @param ctx the parse tree
	 */
	void exitRelativeArithmeticArithmetic(AsistParser.RelativeArithmeticArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#relativeVariableVariable}.
	 * @param ctx the parse tree
	 */
	void enterRelativeVariableVariable(AsistParser.RelativeVariableVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#relativeVariableVariable}.
	 * @param ctx the parse tree
	 */
	void exitRelativeVariableVariable(AsistParser.RelativeVariableVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#relativeIntegerInteger}.
	 * @param ctx the parse tree
	 */
	void enterRelativeIntegerInteger(AsistParser.RelativeIntegerIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#relativeIntegerInteger}.
	 * @param ctx the parse tree
	 */
	void exitRelativeIntegerInteger(AsistParser.RelativeIntegerIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#relativeArithmeticInteger}.
	 * @param ctx the parse tree
	 */
	void enterRelativeArithmeticInteger(AsistParser.RelativeArithmeticIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#relativeArithmeticInteger}.
	 * @param ctx the parse tree
	 */
	void exitRelativeArithmeticInteger(AsistParser.RelativeArithmeticIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#relativeArithmeticVariable}.
	 * @param ctx the parse tree
	 */
	void enterRelativeArithmeticVariable(AsistParser.RelativeArithmeticVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#relativeArithmeticVariable}.
	 * @param ctx the parse tree
	 */
	void exitRelativeArithmeticVariable(AsistParser.RelativeArithmeticVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#relativeVariableArithmetic}.
	 * @param ctx the parse tree
	 */
	void enterRelativeVariableArithmetic(AsistParser.RelativeVariableArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#relativeVariableArithmetic}.
	 * @param ctx the parse tree
	 */
	void exitRelativeVariableArithmetic(AsistParser.RelativeVariableArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#relativeVariableInteger}.
	 * @param ctx the parse tree
	 */
	void enterRelativeVariableInteger(AsistParser.RelativeVariableIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#relativeVariableInteger}.
	 * @param ctx the parse tree
	 */
	void exitRelativeVariableInteger(AsistParser.RelativeVariableIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#relativeIntegerVariable}.
	 * @param ctx the parse tree
	 */
	void enterRelativeIntegerVariable(AsistParser.RelativeIntegerVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#relativeIntegerVariable}.
	 * @param ctx the parse tree
	 */
	void exitRelativeIntegerVariable(AsistParser.RelativeIntegerVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#relativeIntegerArithmetic}.
	 * @param ctx the parse tree
	 */
	void enterRelativeIntegerArithmetic(AsistParser.RelativeIntegerArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#relativeIntegerArithmetic}.
	 * @param ctx the parse tree
	 */
	void exitRelativeIntegerArithmetic(AsistParser.RelativeIntegerArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link AsistParser#notVariable}.
	 * @param ctx the parse tree
	 */
	void enterNotVariable(AsistParser.NotVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#notVariable}.
	 * @param ctx the parse tree
	 */
	void exitNotVariable(AsistParser.NotVariableContext ctx);
}