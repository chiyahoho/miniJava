// Generated from miniJava.g4 by ANTLR 4.6
package cpl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniJavaParser}.
 */
public interface miniJavaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(miniJavaParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(miniJavaParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(miniJavaParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(miniJavaParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(miniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(miniJavaParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(miniJavaParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(miniJavaParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(miniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(miniJavaParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(miniJavaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(miniJavaParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(miniJavaParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(miniJavaParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(miniJavaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniJavaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(miniJavaParser.ExpContext ctx);
}