//import GramLexer
import mypackage.GramLexer
import mypackage.GramParser
//import mypackage.GramWalker
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.ParseTreeWalker
import org.antlr.v4.runtime.CharStreams

//import org.antlr.v4.runtime.CommonTokenStream
//import org.antlr.v4.runtime.tree.ParseTree
//import org.antlr.v4.runtime.tree.ParseTreeWalker

open class MyNode(val token: String) {
    lateinit var children: MutableList<MyNode>
}

class MyTerminalNode(token: String) : MyNode(token) {
    init {
        this.children = emptyList<MyNode>().toMutableList()
    }
}

fun parseChildren(tree: ParseTree, parser: org.antlr.v4.runtime.Parser, parent: MyNode?) {
    val stringNode = tree.toStringTree(parser)
    var type = "literal"

    if (stringNode[0] == '(') {
        type = stringNode.slice(1 until stringNode.length).split(" ")[0]
    }

    if (type == "literal") {
        val literal = MyTerminalNode("literal")
        if (parent != null) {
            parent.children.add(literal)
        } else {
            println("WARNING: LITERAL WAS FOUND, BUT PARENT WAS NOT GIVEN!")
        }
        return
    }

//    println("\nnode: ${stringNode}")
    println("node type: ${type}")

    if (type.toLowerCase().contains("declaration")) {
        val declNode = MyNode(type)
        val identifier = MyTerminalNode("identifier")
        declNode.children.add(identifier)

        if (type == "variableDeclaration") {
            parseChildren(tree.getChild(1), parser, declNode)
        }
    } else if (type.toLowerCase().contains("expression")) {
        if (type == "additiveExpression") {
            val binaryExpression = MyNode("binaryExpression")
            for (i in 0 until tree.childCount) {
                val node = tree.getChild(i)
                parseChildren(node, parser, binaryExpression)
                return
            }
        } else if (type == "primaryExpression") {
            //
        } else {
            if (parent != null) {
                if (parent.token.toLowerCase().contains("expression") && tree.childCount == 1) {
                    parseChildren(tree.getChild(0), parser, parent)
                }
            }
        }
    }

//    for (i in 0 until tree.childCount) {
//        val node = tree.getChild(i)
//        println("child node #${i}: ${node.toStringTree(parser)}")
//    }

//    for (i in 0 until tree.childCount) {
//        val node = tree.getChild(i)
//        parseChildren(node, parser)
//    }
}

fun main(args: Array<String>) {
//    val grammar = Grammar("grammar.json")
//    grammar.removeLeftRec()
//    grammar.print()
//    val str = "a:number=10"
//    val str = "function pow(x0) {\n" +
//            "\treturn x * x\n" +
//            "}\n" +
//            "\n" +
//            "function sub(x0, y0) {\n" +
//            "\treturn x - y;\n" +
//            "}\n" +
//            "\n" +
//            "function f(x0) {\n" +
//            "\treturn sub(pow(x), pow(x-1))\n" +
//            "}\n" +
//            "\n" +
//            "var x = 10\n" +
//            "var y = f(x)"
    val str = "int main() {\n" +
            "   int a = 21;\n" +
            "   int b = 10;\n" +
            "   int c ;\n" +
            "   c = a + b;\n" +
            "}"
//    val lexer = GramLexer("hello world" as CharStream)
    val lexer = GramLexer(CharStreams.fromString(str))
    val tokens = CommonTokenStream(lexer)
    val parser = GramParser(tokens)
    val tree: ParseTree = parser.translationUnit()
    println("tree: ${tree.toStringTree(parser)}")
    println("tree: ${tree.getChild(0).toStringTree(parser)}")
//    val walker = ParseTreeWalker()
//    walker.walk(GramWalker(), tree)
//    println("tree: ${tree}")
//    println("tree: ${tree.}")

//    println("tree children")
//    for (i in 0..tree.childCount) {
//        val node = tree.getChild(i)
//        println("node #${i}: ${node.toStringTree(parser)}")
//    }

//    println("sourceElement1 children")
//    val sourceElement1 = tree.getChild(0).getChild(0)
//    println("sourceElement1: ${sourceElement1.toStringTree(parser)}")
//
//    println("funcDecl children")
//    val funcDecl = tree.getChild(0).getChild(0).getChild(0)
//    for (i in 0 until funcDecl.childCount) {
//        val node = funcDecl.getChild(i)
//        println("node #${i}: ${node.toStringTree(parser)}")
//    }

    val program = MyNode("program")
    parseChildren(tree, parser, program)

    // callExpression
    // literalExpression
    // binaryExpression
    // unaryExpression
    // assignmentExpression
}