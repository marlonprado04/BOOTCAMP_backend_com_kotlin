// Define classe pessoa com alguns atributos
data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {
    // Instanciando classe pessoa sem construtor
    val jake = Person()

    // Definindo variável a partir do objeto criado e usando o apply
    val stringDescription = jake.apply {
        // Atribuindo os valores das propriedades da instância do objeto
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()

    // Printando valores
    println(stringDescription)
    println(jake)
}