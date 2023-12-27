fun main() {
	// Função para retonrar o maior valor dos dois passados
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    // Função na sintaxe antiga
    fun maxOld(a: Int, b: Int): Int{
        if (a > b){
            return a
        } else{
            return b
        }
    }
    
    // Executando ambas funções
    println(max(99, -42))
    println(maxOld(99, -42))

}