// Define classe pessoa
data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

// Define função para criar um log de escrita
fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")              
}

fun main() {
    // Cria instância da classe pessoa
    val jake = Person("Jake", 30, "Android developer")
    
    // Utiliza also para realizar executar a função global
    jake.also {
        writeCreationLog(it)
    }

}