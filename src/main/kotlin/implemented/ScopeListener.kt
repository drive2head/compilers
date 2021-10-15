package implemented

import generated.ObjectiveCParser
import generated.ObjectiveCParserBaseListener
import org.antlr.v4.runtime.tree.TerminalNode


class ScopeListener : ObjectiveCParserBaseListener() {
    var scopeId = 0
    var globalScope = Scope(scopeId++)
    var currentScope = globalScope

    var isFunctionBlock = false
    var functionName: String? = ""

    override fun enterFunctionDefinition(ctx: ObjectiveCParser.FunctionDefinitionContext?) {
        functionName = ctx?.functionSignature()?.identifier()?.IDENTIFIER()?.text
        isFunctionBlock = true

        val currScope = Scope(scopeId++)
        currScope.parentScope = globalScope
        currScope.name = functionName
        currentScope = currScope

        globalScope.childScopes.add(currScope)

        super.enterFunctionDefinition(ctx)
    }

    override fun enterBlock(ctx: ObjectiveCParser.BlockContext?) {
        if (isFunctionBlock) {
            isFunctionBlock = false
            super.enterBlock(ctx)
            return
        }

        val tmpScope = Scope(scopeId++)
        var parent = ctx?.parent?.parent ?: throw Error("Fix me")
        var scopeName = "-"
        if (parent is ObjectiveCParser.BlockContext) {
            scopeName += "block"
        } else if (parent is ObjectiveCParser.ConditionStatementContext) {
            scopeName += "if-block"
        }
        scopeName += " ${tmpScope.id}"

        tmpScope.parentScope = currentScope
        tmpScope.name = "${currentScope.name}-$scopeName"
        currentScope.childScopes.add(tmpScope)
        currentScope = tmpScope

        super.enterBlock(ctx)
    }

    override fun exitBlock(ctx: ObjectiveCParser.BlockContext?) {
        currentScope = currentScope.parentScope!!

        super.exitBlock(ctx)
    }

    override fun enterVarDeclaration(ctx: ObjectiveCParser.VarDeclarationContext?) {
        var varType = ctx?.declarationSpecifiers()?.typeSpecifier()?.getChild(0)?.text
            ?: throw Error("Не найден тип переменной")
        val varName = ctx.initDeclaratorList()?.initDeclarator(0)?.declarator()?.directDeclarator()?.identifier()?.IDENTIFIER()?.text
            ?: throw Error("Не найдено имя переменной")

        currentScope.variables.put(varName, varType)

        super.enterVarDeclaration(ctx)
    }


}