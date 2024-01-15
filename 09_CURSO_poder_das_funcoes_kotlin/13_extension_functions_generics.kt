// Criando extensão para qualquer tipo informando que ela pode ser nula
// e que quando for nulo vai mandar a mensagem específica
fun <T> T?.nullSafeToString() = this?.toString() ?: "AUSÊNCIA DE VALOR"

fun main() {
    // Executando
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}