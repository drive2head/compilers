class MyParser {
    private var tokens = ""
    private var pos = 0
    private lateinit var grammar: Grammar

    fun setGrammar(grammar: Grammar) {
        this.grammar = grammar
    }

    fun setPos(newPos: Int) {
        this.pos = newPos
    }

    fun parse(tokens: String) {
        this.tokens = tokens
        this.pos = 0
        val terms: List<String> = emptyList() // TODO: получить отсортированные термы из грамматики

        /*
        try:
            res = this.program()
            println('Ok')
        else:
            println('Not Ok')
         */
    }

    fun token(): String {
        var token = this.tokens[this.pos]

        while (token == ' ') {
            this.pos += 1
            token = this.tokens[this.pos]
        }

        return token.toString()
    }


}