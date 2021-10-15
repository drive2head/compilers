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
    var needHandleFuncParameters = false

    /** Var объявление переменных */
    var enterVarSpecFlag = false
    var varTypeForVarSpec = ""
    var variableNames: MutableList<String>? = null
    var varTypes: MutableList<String>? = null

    var enterShortVarDecl = false

    override fun enterFunctionDefinition(ctx: ObjectiveCParser.FunctionDefinitionContext?) {
        functionName = ctx?.functionSignature()?.identifier()?.IDENTIFIER()?.text
        isFunctionBlock = true
        needHandleFuncParameters = true

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
        println(scopeId)

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

//        if (enterVarSpecFlag || enterShortVarDecl) {
//            for (varName in ctx.children) {
//                if (varName.text != ",") {
//                    variableNames!!.add(varName.text)
//                }
//            }
//        }

        super.enterVarDeclaration(ctx)
    }


}


// todo опрелять тип переменной в случае короткого присваивания другой переменной: x := y (где y int)
// todo кажется сложно, можно для данного случая решить локально, но в целом это частный случай оценки типа выражения
// todo определять через присваивание также типы
//    | structType
//    | pointerType
//    | functionType
//    | interfaceType

// shortVarDecl ":=" может быть в:
// if
// for
// switch
// type switch???
//var needHandleFuncParameters = false // todo когда ставить в false, после обработки параметров функции?
//needHandleFuncParameters = false // todo тут неверно мб, лучше когда заходим в блок функции текущей
