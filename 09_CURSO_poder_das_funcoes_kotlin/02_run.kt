fun main() {
	// Cria função paraprintar o número de caracteres de uma string
    fun getNullableLength(ns: String?) {
        // Printa variavel passada
        println("for \"$ns\":")
        // Executa função run para informar se é vazia e retornar o tamanho 
        // total no caso de não ser
        ns?.run {
         	// Executa a verificação sem declarar uma variável
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")                           
        }
    }
    
    // Realiza testes com nulo, fazio e strings
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")

}