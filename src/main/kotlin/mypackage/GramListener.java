// Generated from /Users/garanya/Desktop/Учеба/Компиляторы/compilers/src/main/kotlin/mypackage/Gram.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramParser}.
 */
public interface GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(GramParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(GramParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link GramParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GramParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GramParser.StartContext ctx);
}