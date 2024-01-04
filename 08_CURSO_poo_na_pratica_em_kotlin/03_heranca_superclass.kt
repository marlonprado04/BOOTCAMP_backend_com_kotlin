// Cria classe que pode ser extendida em outras classes
open class Lion(val name: String, val origin: String) {
    // Cria função para dizer olá
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

// Cria classe para instanciar um leão asiático que só recebe o nome (a origem é sempre a mesma)
class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    // Cria instância de Leão e passa como parâmetro
    // a classe asiatica criada
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()
}