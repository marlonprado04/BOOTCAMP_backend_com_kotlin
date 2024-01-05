// Cria uma classe selada do tipo mamífero
sealed class Mammal(val name: String)

// Cria classes gato e humano que vão extender a classe mamífero
// e passa os nomes específicos para a classe mamífero
class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

// Cria função genérica de mamífero para retornar uma mensagem
// específica de acordo com o tipo de mamifero
fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        // Se for humano, imprime nome e trabalho do mamífero
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        // Se for gato, imprime nome
        is Cat -> return "Hello ${mammal.name}"    
    }
}

fun main() {
    // Imrpimindo mensagem para gato e humano
    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Marlon", "TI")))
    
    
}