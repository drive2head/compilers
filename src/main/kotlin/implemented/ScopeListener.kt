package implemented

import generated.ObjectiveCParser
import generated.ObjectiveCParserBaseListener



class ScopeListener : ObjectiveCParserBaseListener() {
    var scopeId = 0
    var globalScope = Scope(scopeId++)
    var currentScope = globalScope

    var isFunctionBlock = false
    var needHandleFuncParameters = false

    /** Var объявление переменных */
    var enterVarSpecFlag = false
    var varTypeForVarSpec = ""
    var variableNames: MutableList<String>? = null
    var varTypes: MutableList<String>? = null

    var enterShortVarDecl = false
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
