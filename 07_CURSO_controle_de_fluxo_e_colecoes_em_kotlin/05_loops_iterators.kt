// Classe animal
class Animal(val name: String)

// Classe zoológico que recebe uma lista de animais
class Zoo(val animals: List<Animal>) {

    // Operator fun permite que a classe zoo seja iterada
    operator fun iterator(): Iterator<Animal> {             // 1
        // Retorna a lista de animais iterada
        return animals.iterator()                           // 2
    }
}

fun main() {
	// Cria uma lista de animais
    val animals = listOf(Animal("Zebra"), Animal("Leao"))
    
    // Instancia a classe "zoo" e passa a lista de animais
    val zoo = Zoo(animals)
	
    // Itera na lista de animais dentro da instância "zoo"
    for (animal in zoo) {
        // Printa o nome do animal da iteração atual
        println("Watch out, it's a ${animal.name}")
    }

}