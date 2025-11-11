// Generated from ParserProject.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserProjectParser}.
 */
public interface ParserProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ParserProjectParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ParserProjectParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ParserProjectParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ParserProjectParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#innerarray}.
	 * @param ctx the parse tree
	 */
	void enterInnerarray(ParserProjectParser.InnerarrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#innerarray}.
	 * @param ctx the parse tree
	 */
	void exitInnerarray(ParserProjectParser.InnerarrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ParserProjectParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ParserProjectParser.AssignmentContext ctx);
}