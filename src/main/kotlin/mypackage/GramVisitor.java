// Generated from /Users/stroom/GitHub/compilers/src/main/kotlin/mypackage/Gram.g4 by ANTLR 4.9.1
package mypackage;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GramParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GramVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GramParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(GramParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link GramParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GramParser.StartContext ctx);
}