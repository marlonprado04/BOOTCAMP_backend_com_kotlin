fun main() {

	val a = 10
    val b = 0 
    
    // Declara variável e tenta armazenar divisão, senão armazena null
    val divisao = try { a / b } catch (e: ArithmeticException) { null }
	
    // Printa a variável
    println(divisao)
}