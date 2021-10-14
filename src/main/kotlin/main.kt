import generated.ObjectiveCLexer
import generated.ObjectiveCParser
import implemented.CallGraphListener
import implemented.ScopeListener
import implemented.TreeTransformer
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker

fun main() {
    val example_scopes = """
        int main() {
            void bar() {
                int b = 2;
            }

            int result;
            
            if (num1 > num2) {
                result = num1;
            } else {
                int b = 4;
            }
        }
    """

    val example_calls = """
        void foo() {
            int a = 1;
            bar()
            
            int a = 1 + 2;
        }
        
        void bar() {
            int b = 2;
        }
        
        int main() {
            foo()
            bar()
        }
    """

    val input = example_calls

    /////////////////////
    // ДЕРЕВО ВЫЗОВОВ  //
    /////////////////////

    // Преобразуем вход к классу, с которым работает ANTLR
    var inputStream = ANTLRInputStream(input)
    // Передаем преобразованных вход в лексер
    var lexer = ObjectiveCLexer(inputStream)
    // Получаем поток токенов
    var tokenStream = CommonTokenStream(lexer)
    // Передаем поток токенов парсеру
    var parser = ObjectiveCParser(tokenStream)

    // ?
    val callGraphListener = CallGraphListener()
    // ?
    var parseTreeWalker = ParseTreeWalker()
    // Обход дерева
    parseTreeWalker.walk(
        callGraphListener, // ?
        parser.translationUnit() // дерево
    )
    // Строим деерво вызовов
    val callGraph = callGraphListener.buildCallGraph()
    if (callGraph != null) {
        // Если дерево построилось, генерим dot файл
        callGraph.toDot()
    }

    /////////////////////////
    //  Области видимости  //
    /////////////////////////

    inputStream = ANTLRInputStream(input)
    lexer = ObjectiveCLexer(inputStream)
    tokenStream = CommonTokenStream(lexer)
    parser = ObjectiveCParser(tokenStream)
    val scopeListener = ScopeListener()
    parseTreeWalker.walk(scopeListener, parser.translationUnit())
    // ?
    scopeListener.globalScope.toDot()

    /////////////////////////////////
    //  Дерево, кот. выдал парсер  //
    /////////////////////////////////

    inputStream = ANTLRInputStream(input)
    lexer = ObjectiveCLexer(inputStream)
    tokenStream = CommonTokenStream(lexer)
    parser = ObjectiveCParser(tokenStream)
    val treeConverter = TreeTransformer()
    val root = treeConverter.convert(parser.translationUnit())
    root.toDot()

    println("hello!")
}