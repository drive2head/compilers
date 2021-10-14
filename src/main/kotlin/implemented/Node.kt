package implemented

import java.io.File
import java.lang.StringBuilder

class Node(private val name: String, val id: String) {
    val childs: MutableList<Node> = mutableListOf()

    fun toDot() {
        val builder = StringBuilder()
        builder.append("digraph Tree {\n$id [label=\"$name\"];\n")

        toDotFile(this, builder)

        builder.append("}")
        val dot = builder.toString()
        File("tree.dot").writeText(dot)
    }

    private fun toDotFile(node: Node, builder: StringBuilder) {
        for (child in node.childs) {
            builder.append("${child.id} [label=\"${child.name}\"];\n")
            builder.append("${node.id} -> ${child.id};\n")
        }
        for (child in node.childs) {
            toDotFile(child, builder)
        }
    }
}