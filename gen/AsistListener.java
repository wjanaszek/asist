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
	 * Enter a parse tree produced by {@link AsistParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AsistParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AsistParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AsistParser.ExpressionContext ctx);
}