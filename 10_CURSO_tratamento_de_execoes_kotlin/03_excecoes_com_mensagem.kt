fun main() {

	val a = 10
    val b = 0 
    
    // Declara variável e tenta armazenar divisão, senão armazena null
    val divisao = try { 
        println("Tentando a divisão...")
        a / b 
    } catch (e: ArithmeticException) {
        println("Erro na divisão!")
        null
    } finally{
        println("Encerrando tentativa. \n")
    }
	
    // Printa a variável
    println("Resultado da divisao: " + divisao)
}