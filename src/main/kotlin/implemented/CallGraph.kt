package implemented

import java.io.File
import java.lang.StringBuilder

class CallGraph(private val map: Map<String, List<String>>) {
    fun toDot() {
        val builder = StringBuilder()
        builder.append("digraph CallGraph {\n")
        for ((k, v) in map) {
            builder.append("$k;\n")
        }

        for ((k, list) in map) {
            for (f in list) {
                builder.append("$k -> $f;\n")
            }
        }
        builder.append("}")
        val dot = builder.toString()
        File("callGraph.dot").writeText(dot)
    }
}