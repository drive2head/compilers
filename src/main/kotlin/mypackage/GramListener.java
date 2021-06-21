// Generated from /Users/stroom/GitHub/compilers/src/main/kotlin/mypackage/Gram.g4 by ANTLR 4.9.1
package mypackage;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GramParser}.
 */
public interface GramListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GramParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(GramParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link GramParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(GramParser.RContext ctx);
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