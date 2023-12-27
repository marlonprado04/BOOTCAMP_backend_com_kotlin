fun main() {
    // Chamando a função "cases" e passando algo como parâmetro
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

// Criando função "cases" que recebe um objeto de qualquer tipo como parâmetro
fun cases(obj: Any) {                                
    // Chamando o "when" e passando o objeto recebido como parâmetro
    when (obj) {                                     // 1
        // Se o objeto for 1, imprime "one"
        1 -> println("One")                          // 2
        // Se o objeto for "Hello", imprime "Greeting"
        "Hello" -> println("Greeting")               // 3
        // Se for do tipo long, imprime "Long"
        is Long -> println("Long")                   // 4
        // Se não for do tipo "String", imprime "not a string"
        !is String -> println("Not a string")        // 5
        // Senão, imprime "unknown"
        else -> println("Unknown")                   // 6
    }   
}

// Criando classe simbólica para passar como parâmetro
class MyClass