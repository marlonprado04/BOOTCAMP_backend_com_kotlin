fun main() {
    // Define infix function para receber um int e uma string
    // e replicar o número de vezes especificado pelo int
    infix fun Int.times(str: String) = str.repeat(this)

    // Exemplo de uso
    println(2 times "Bye ") // Imprime "Bye " 2 vezes

    // Cria variável pair e utiliza a infix function nativa "to" para criar uma
    // estrutura de dados que ferrari pertence katrina
    val pair = "Ferrari" to "Katrina"

    // Exemplo de resultado
    println(pair)

    // Cria exemplo de infix funcion identico ao anterior
    // que recebe 2 strings
    infix fun String.onto(other: String) = Pair(this, other)
    
    // Exemplo de uso
    val myPair = "McLaren" onto "Lucas"
    println(myPair)


    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia 
    }

// Cria casse pessoa com construtor de nome
class Person(val name: String) {
    // Cria variável de lista mutável do tipo pessoa
    val likedPeople = mutableListOf<Person>()
    // Cria infix function para adicionar uma pessoa à lista de outra
    infix fun likes(other: Person) { likedPeople.add(other) }

}