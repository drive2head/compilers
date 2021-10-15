package implemented

import generated.ObjectiveCParser
import generated.ObjectiveCParserBaseListener
import org.antlr.v4.runtime.ParserRuleContext

class CallGraphListener: ObjectiveCParserBaseListener() {
    var mainCall = CallGraph("main")
    var currentCall: CallGraph? = null
    var functions = mutableMapOf<String, CallGraph>()

    override fun enterFunctionDefinition(ctx: ObjectiveCParser.FunctionDefinitionContext?) {
        val callName = ctx?.functionSignature()?.identifier()?.IDENTIFIER()?.text
            ?: throw Error("Ошибка при получении имени вызова")
        val call = CallGraph(callName)
        functions[callName] = call
        currentCall = call

        super.enterFunctionDefinition(ctx)
    }

    override fun exitFunctionDefinition(ctx: ObjectiveCParser.FunctionDefinitionContext?) {
        currentCall = null

        super.exitFunctionDefinition(ctx)
    }

    override fun enterFunctionCall(ctx: ObjectiveCParser.FunctionCallContext?) {
        val callName = ctx?.primaryExpression()?.identifier()?.IDENTIFIER()?.text
            ?: throw Error("Ошибка при получении имени вызова")
        val call = functions[callName] ?: throw Error("Не удалось найти функцию $callName")
        if (currentCall == null) throw Error("Для вызова функции не определена родительская функция")
        currentCall!!.childCalls.add(call)
        call.parent = currentCall!!

        super.enterFunctionCall(ctx)
    }

    override fun enterFunctionCallWithFunctionCallsArgs(ctx: ObjectiveCParser.FunctionCallWithFunctionCallsArgsContext?) {
        val callName = ctx?.primaryExpression()?.identifier()?.IDENTIFIER()?.text
            ?: throw Error("Ошибка при получении имени вызова")
        val argumentsCalls = mutableListOf<String>()

        fun addFunctionCall(functionCallCtx: ParserRuleContext) {
            if (functionCallCtx is ObjectiveCParser.FunctionCallContext) {
                val _callName = functionCallCtx.primaryExpression().identifier().IDENTIFIER().text
                argumentsCalls.add(_callName)
            } else if (functionCallCtx is ObjectiveCParser.FunctionCallWithFunctionCallsArgsContext) {
                functionCallCtx.argumentExpressionListWithFunctionCalls().argumentExpression().filter {
                    it is ObjectiveCParser.FunctionCallContext || it is ObjectiveCParser.FunctionCallWithFunctionCallsArgsContext
                }.forEach {
                    addFunctionCall(it)
                }
            } else {
                throw Error("В addFunctionCall передан контекст, не являющийся вызовом")
            }
        }

        ctx.argumentExpressionListWithFunctionCalls()?.argumentExpression()?.filter {
            it is ObjectiveCParser.FunctionCallContext || it is ObjectiveCParser.FunctionCallWithFunctionCallsArgsContext
        }?.forEach { addFunctionCall(it) }

        if (currentCall == null) throw Error("Для вызова функции не определена родительская функция")

        argumentsCalls.add(callName)
        argumentsCalls.forEach { callName ->
            val call = functions[callName] ?: throw Error("Не удалось найти функцию $callName")
            currentCall!!.childCalls.add(call)
        }

        super.enterFunctionCallWithFunctionCallsArgs(ctx)
    }

    fun buildCallGraph(): CallGraph? {
        return functions["main"]
    }
}