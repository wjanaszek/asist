// Generated from /Users/wjanaszek/Workspace/IdeaProjects/asist/src/main/antlr4/Asist.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AsistParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AsistVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AsistParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(AsistParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AsistParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AsistParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#notificationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotificationStatement(AsistParser.NotificationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#firedWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiredWhen(AsistParser.FiredWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#timeBased}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeBased(AsistParser.TimeBasedContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#singleTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTime(AsistParser.SingleTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#pluralTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluralTime(AsistParser.PluralTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#actionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActionType(AsistParser.ActionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#timePrecisely}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimePrecisely(AsistParser.TimePreciselyContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#onEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnEvent(AsistParser.OnEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#every}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvery(AsistParser.EveryContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(AsistParser.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#second}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond(AsistParser.SecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#seconds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeconds(AsistParser.SecondsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#minute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinute(AsistParser.MinuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#minutes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinutes(AsistParser.MinutesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#hour}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour(AsistParser.HourContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#hours}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHours(AsistParser.HoursContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#variableOrAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableOrAssignment(AsistParser.VariableOrAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AsistParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#variableAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(AsistParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AsistParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#assignVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVariable(AsistParser.AssignVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(AsistParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#searchFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchFunction(AsistParser.SearchFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#objectProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectProperties(AsistParser.ObjectPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#arithmeticOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperation(AsistParser.ArithmeticOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#additionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditionExpression(AsistParser.AdditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#multiplyExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(AsistParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#atomExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpression(AsistParser.AtomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AsistParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(AsistParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AsistParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#conditionExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionExpression(AsistParser.ConditionExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#ifInstructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInstructions(AsistParser.IfInstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#elseInstructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseInstructions(AsistParser.ElseInstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(AsistParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(AsistParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(AsistParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(AsistParser.FactorContext ctx);
}