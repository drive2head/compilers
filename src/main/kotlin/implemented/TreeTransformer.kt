package implemented

import org.antlr.v4.runtime.tree.ParseTree
import java.lang.StringBuilder
import kotlin.random.Random

class TreeTransformer {

    fun convert(tree: ParseTree): Node {
        val random = Random(0)
        return convert(tree, random)
    }

    private fun convert(tree: ParseTree, random: Random): Node {

        val node = Node(getNodeName(tree), random.nextInt().toString())
        for (i in 0 until tree.childCount) {
            val childNode = convert(tree.getChild(i), random)
            node.childs.add(childNode)
        }
        return node
    }

    private fun getNodeName(context: ParseTree): String {

        if (context.javaClass.name == "org.antlr.v4.runtime.tree.TerminalNodeImpl") {
            if (context.text[0] == '"') {
                val stringBuilder = StringBuilder()
                stringBuilder.append(context.text)
                stringBuilder.insert(0, "\\")
                stringBuilder.insert(context.text.length, "\\")
                return stringBuilder.toString()
            }
            return context.text
        }
        return context.javaClass.name.removePrefix("generated.GoParser$").removeSuffix("Context")
    }
}