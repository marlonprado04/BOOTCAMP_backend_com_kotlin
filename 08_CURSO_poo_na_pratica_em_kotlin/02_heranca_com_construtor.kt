// Criando classe que pode ser herdada
open class Tiger(val origin: String) {
    // Função para dizer olá
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

// Criando classe que constroi um tigre da sibéria
class SiberianTiger : Tiger("Siberia")

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()
}