// Função recebe 2 parâmetros e também uma função que recebe 2 parâmetros e retorna 1 
fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

// Função soma
fun sum(x: Int, y: Int) = x + y

fun main() {
    // Podemos usar a função calculate e passar a função soma como parâmetro
    // para exevutar a função soma
    val sumResult = calculate(4, 5, ::sum)
    // Podemos também usar uma função lambda para calcular uma multiplicação
    val mulResult = calculate(4, 5) { a, b -> a * b }
    // Printando o resultado
    println("sumResult $sumResult, mulResult $mulResult")
}