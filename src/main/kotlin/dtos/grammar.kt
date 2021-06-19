package dtos

data class GrammarDto (
    val nonterminals: List<String>,
    val terminals: List<String>,
    val productions: List<Map<String, List<String>>>,
    val startSymbol: String,
)