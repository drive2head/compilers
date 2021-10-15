import generated.ObjectiveCLexer
import generated.ObjectiveCParser
import implemented.CallGraphListener
import implemented.ScopeListener
import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.tree.ParseTreeWalker

fun main() {
    val example_scopes = """
        int main() {
            int e = 5;
        
            if (true) {
                int a = 1;
            } else {
                int b = 1;
                NSArray *arr = @[ @"1", @"2", @"3" ];
            }
        
            {
                int c = 3;
                {
                    int d = 4;
                }
            }
        }
    """

    val example_calls = """
        int foo() {
            return 1;
        }

        int bar() {
            foo();
        }

        int main() {
            foo();

            bar(foo());
        }
    """


    val input = example_calls
//    val input = example_scopes

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

    val callGraphListener = CallGraphListener()
    var parseTreeWalker = ParseTreeWalker()
    // Обход дерева
    parseTreeWalker.walk(callGraphListener, parser.translationUnit())
    // Строим дерево вызовов
    val callGraph = callGraphListener.buildCallGraph()
    // Если дерево построилось, генерим dot файл
    callGraph?.toDot()

    /////////////////////////
    //  Области видимости  //
    /////////////////////////

    inputStream = ANTLRInputStream(input)
    lexer = ObjectiveCLexer(inputStream)
    tokenStream = CommonTokenStream(lexer)
    parser = ObjectiveCParser(tokenStream)
    val scopeListener = ScopeListener()
    parseTreeWalker.walk(scopeListener, parser.translationUnit())
    scopeListener.globalScope.toDot()

    println("Finished!")
}