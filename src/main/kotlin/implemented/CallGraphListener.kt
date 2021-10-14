package implemented

import generated.ObjectiveCParser
import generated.ObjectiveCParserBaseListener

class CallGraphListener: ObjectiveCParserBaseListener() {
    var functionWithFunctionList = mutableMapOf<String, MutableList<String>>()
    private var currentFunctionName = ""
    private var calledFunctionName = ""

    /** не менял */
    fun buildCallGraph(): CallGraph? {
        val mainFunctions = functionWithFunctionList["main"] ?: return null

        if (mainFunctions.isEmpty()) {
            return CallGraph(mapOf("main" to listOf()))
        }


        val execFuncSet = mutableSetOf<String>().apply {
            add("main")
        }
        val iterateFuncQueue = mutableListOf<String>().apply {
            add("main")
        }
        while (true) {
            val tmpFuncName = iterateFuncQueue.removeFirstOrNull()
            if (tmpFuncName == null) {
                break
            }

            var funcList = functionWithFunctionList[tmpFuncName]
            if (funcList == null) {
                continue
            }

            for (f in funcList) {
                execFuncSet.add(f)
                iterateFuncQueue.add(f)
            }
        }


        val calledFunctions = mutableMapOf<String, MutableList<String>>()

        for (f in execFuncSet) {
            val list = functionWithFunctionList[f]
            if (list == null) {
                continue
            }
            calledFunctions.put(f, list)
        }

        return CallGraph(calledFunctions)
    }
}