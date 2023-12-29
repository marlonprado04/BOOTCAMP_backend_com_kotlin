// Para que a classe possa ser extendida em outra
// é necessário iniciar a declaração com o modificador "open"
open class Dog {
    // O mesmo vale para funções
    open fun sayHello() {
        println("wow wow!")
    }
}

// Para implementar a classe, usamos a sintaxe abaixo
// le-se: Yorkshire é um cachorro
class Yorkshire : Dog() {
    // Para aproveitar a função compartilhada, usamos o modificador
    // override para sobreescrever a função 
    override fun sayHello() {
        println("wif wif!")
    }
}

fun main() {
    // Instanciando o cachorro e tipando como um cachorro
    // mas atribuindo um tipo Yorkshire para ele
    val dog: Dog = Yorkshire()
    // Printando mensagem 
    dog.sayHello()
}