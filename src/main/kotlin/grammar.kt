import com.beust.klaxon.Klaxon
import dtos.GrammarDto

class Grammar(fileName: String) {

    private var nonterminals: MutableList<String> = mutableListOf()
    private var terminals: List<String> = emptyList()
    private var productions: MutableList<Map<String, List<String>>> = mutableListOf()
    private var startSymbol: String = ""

    init {
        this.import(fileName)
    }

    fun print() {
        println("nonterminals: ${this.nonterminals}\n" +
                "terminals: ${this.terminals}\n" +
                "productions: ${this.productions}\n" +
                "start: ${this.startSymbol}")
    }

    private fun import(fileName: String) {
        val jsonString: String = object {}.javaClass.getResource(fileName).readText()
        val parsed = Klaxon().parse<GrammarDto>(jsonString) ?: throw Error()

        this.nonterminals = parsed.nonterminals as MutableList<String>
        this.terminals = parsed.terminals
        this.productions = parsed.productions as MutableList<Map<String, List<String>>>
        this.startSymbol = parsed.startSymbol

        println(this.productions)
    }

    fun __productionsFor(nonterm: String): List<Map<String, List<String>>> {
        return this.productions.filter {
            it.containsKey(nonterm)
        }
    }

    fun removeLeftRec() {
        var new_nonterms = mutableListOf<String>()
        for (i in 0 until this.nonterminals.size) {
            val Ai = this.nonterminals[i]
            for (j in 0..i) {
                val Aj = this.nonterminals[j]

                val Aj_productions = this.__productionsFor(Aj)
                var old_productions = mutableListOf<Map<String, List<String>>>()
                var new_productions = mutableListOf<Map<String, List<String>>>()

                for (p in this.__productionsFor(Ai)) {
                    val p_key = p.keys.toList()[0]
                    val p_value = p[p_key]!!
                    if (p[p_key]!![0] == Aj) {
                        for (aj_p in Aj_productions) {
                            val aj_p_key = aj_p.keys.toList()[0]
                            val aj_p_value = aj_p[aj_p_key]!!
                            val new_production_right_part = aj_p_value + p_value.slice(1 until p_value.size)
                            new_productions.add(mapOf(Ai to new_production_right_part.toSet().toList()))
                        }
                        old_productions.add(p)
                    }
                }

                for (p in old_productions)
                    this.productions.remove(p)

                for (p in new_productions)
                    this.productions.add(p)
            }

            val Anew = "$Ai'"
            var old_productions = mutableListOf<Map<String, List<String>>>()
            var new_productions = mutableListOf<Map<String, List<String>>>()

            for (p in this.__productionsFor(Ai)) {
                val p_key = p.keys.toList()[0]
                val p_value = p[p_key]!!
                if (p[p_key]!![0] == Ai) {
                    val new_production_right_part = p_value.slice(1 until p_value.size) + listOf(Anew)
                    new_productions.add(mapOf(Anew to new_production_right_part))
                    old_productions.add(p)
                }
            }

            if (old_productions.size > 0) {
                for (p in this.__productionsFor(Ai)) {
                    val p_key = p.keys.toList()[0]
                    val p_value = p[p_key]!!
                    if (p[p_key]!![0] != Ai) {
                        val new_production_right_part = p_value + listOf(Anew)
                        new_productions.add(mapOf(Ai to new_production_right_part))
                        old_productions.add(p)
                    }
                }
                new_productions.add(mapOf(Anew to listOf("eps")))
            }

            for (p in old_productions)
                this.productions.remove(p)

            for (p in new_productions)
                this.productions.add(p)
        }

        for (new_nonterm in new_nonterms)
            this.nonterminals.add(new_nonterm)
    }
}