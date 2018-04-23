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
	 * Visit a parse tree produced by {@link AsistParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(AsistParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AsistParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AsistParser.ExpressionContext ctx);
}