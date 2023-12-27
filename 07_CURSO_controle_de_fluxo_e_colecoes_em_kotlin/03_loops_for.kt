fun main() {
	// Criando lista de bolos através da função implícita "listOf"
    val cakes = listOf("carrot", "cheese", "chocolate")
    
    // Percorrendo cada bolo dentro da lista de bolos
    // Para cada bolo da lista, imprime a mensagem
    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }


}