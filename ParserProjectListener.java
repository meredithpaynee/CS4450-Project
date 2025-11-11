// Generated from ParserProject.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ParserProjectParser}.
 */
public interface ParserProjectListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(ParserProjectParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(ParserProjectParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link ParserProjectParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(ParserProjectParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link ParserProjectParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(ParserProjectParser.XContext ctx);
}