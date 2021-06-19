import com.beust.klaxon.Klaxon
import dtos.GrammarDto

class Grammar(fileName: String) {

    private var nonterminals: List<String> = emptyList()
    private var terminals: List<String> = emptyList()
    private var productions: List<Map<String, List<String>>> = emptyList()
    private var startSymbol: String = ""

    init {
        this.import(fileName)
    }

    private fun import(fileName: String) {
        val jsonString: String = object {}.javaClass.getResource(fileName).readText()
        val parsed = Klaxon().parse<GrammarDto>(jsonString) ?: throw Error()

        this.nonterminals = parsed.nonterminals
        this.terminals = parsed.terminals
        this.productions = parsed.productions
        this.startSymbol = parsed.startSymbol

        println(this.productions)
    }


}