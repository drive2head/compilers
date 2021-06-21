//import GramLexer
//import mypackage.GramParser
//import mypackage.GramWalker
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.CharStreams

//import org.antlr.v4.runtime.CommonTokenStream
//import org.antlr.v4.runtime.tree.ParseTree
//import org.antlr.v4.runtime.tree.ParseTreeWalker



fun main(args: Array<String>) {
//    val grammar = Grammar("grammar.json")
//    grammar.removeLeftRec()
//    grammar.print()
    val str = "a:number=10"
//    val lexer = GramLexer("hello world" as CharStream)
    val lexer = GramLexer(CharStreams.fromString(str))
    val tokens = CommonTokenStream(lexer)
    println("tokens: ${tokens.tokens}")
    val parser = GramParser(tokens)
    val tree: ParseTree = parser.prog()
    val walker = ParseTreeWalker()
    walker.walk(GramWalker(), tree)
    println("tree: ${tree}")
}