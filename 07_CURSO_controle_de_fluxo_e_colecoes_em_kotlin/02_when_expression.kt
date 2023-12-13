fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}


// Criando função que receve qualquer tipo de parâmetro e retorna qualquer tipo 
fun whenAssign(obj: Any): Any {
    // Atribui o resultado do "when" para a variável result criada
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> 42                              // 5
    }
    return result
}

class MyClass