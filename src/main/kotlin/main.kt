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
//    val str = "a:number=10"
    val str = "{ let a: number = 3;##const b = a - 3; }"
//    val lexer = GramLexer("hello world" as CharStream)
    val lexer = GramLexer(CharStreams.fromString(str))
    val tokens = CommonTokenStream(lexer)
    val parser = GramParser(tokens)
    val tree: ParseTree = parser.r()
    println("tree: ${tree.toStringTree(parser)}")
//    println("tree: ${tree.getChild(0).toStringTree(parser)}")
    val walker = ParseTreeWalker()
    walker.walk(GramWalker(), tree)
//    println("tree: ${tree}")
//    println("tree: ${tree.}")
}