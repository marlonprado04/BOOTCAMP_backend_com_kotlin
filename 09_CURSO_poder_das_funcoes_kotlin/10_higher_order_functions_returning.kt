// Função operation retorna uma outra função
fun operation(): (Int) -> Int {
    return ::square
}

// Função que calcula o quadrado de um número 
fun square(x: Int) = x * x

fun main() {
    // Executando função
    val func = operation()
    println(func(2))
}