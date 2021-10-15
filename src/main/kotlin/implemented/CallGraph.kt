package implemented

import java.io.File
import java.lang.StringBuilder

class CallGraph(val name: String) {
    var parent: CallGraph? = null
    var childCalls: MutableList<CallGraph> = mutableListOf()

    var map: MutableMap<String, MutableList<String>> = mutableMapOf()

    fun toDot() {
        val builder = StringBuilder()
        builder.append("digraph CallGraph {\n")

        fun toDotChild(callGraph: CallGraph) {
            callGraph.childCalls.forEach { call ->
                toDotChild(call)
                if (map[callGraph.name] == null) {
                    map[callGraph.name] = mutableListOf()
                }
                val childCalls = map[callGraph.name]!!
                childCalls.add(call.name)
            }
        }

        childCalls.forEach { call ->
            toDotChild(call)
            if (map[name] == null) {
                map[name] = mutableListOf()
            }
            val childCalls = map[name]!!
            childCalls.add(call.name)
        }

        map.forEach { (parentCall, _) ->
            builder.append("\t${parentCall};\n")
        }
        map.forEach { (parentCall, childCalls) ->
            childCalls.forEach { childCall ->
                builder.append("\t${parentCall} -> ${childCall};\n")
            }
        }

        builder.append("}")
        val dot = builder.toString()
        File("callGraph.dot").writeText(dot)
    }
}