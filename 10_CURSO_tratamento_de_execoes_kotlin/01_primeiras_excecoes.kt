fun main() {

	val a = 10
    val b = 0 
    
    
    try {
        // Tenta dividir por 0
        val divisao = a / b
    } catch (e: ArithmeticException) {
        // Imprime mensagem personalizada
		println("Ocorreu uma exceção aritmética!")
    } catch(e: Throwable){
        // Imprime exceção padrão
        println(e.message)
    }finally(){
        // Imprime mensagem independende de erro ou acerto
        println("O finally foi executado!")
    }
}