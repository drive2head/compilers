package implemented

import java.io.File
import java.lang.StringBuilder

class Scope(val id: Int) {
    var parentScope: Scope? = null
    var childScopes: MutableList<Scope> = mutableListOf()
    var variables: MutableMap<String, String> = mutableMapOf() // имя переменной, тип переменной

    fun toDot() {
        val builder = StringBuilder()
        builder.append("digraph Scopes {\n")

        toDotFile(this, builder)
        builder.append("}")
        val dot = builder.toString()
        File("scopes.dot").writeText(dot)
    }

    private fun toDotFile(scope: Scope, builder: StringBuilder) {
        builder.append("${scope.id} [label=\"")
        for ((k, v) in scope.variables) {
            builder.append("$k: $v, ")
        }
        builder.append("\"];\n")

        for (childScope in scope.childScopes) {
            builder.append("${scope.id} -> ${childScope.id};\n")
        }

        for (childScope in scope.childScopes) {
            toDotFile(childScope, builder)
        }
    }
}