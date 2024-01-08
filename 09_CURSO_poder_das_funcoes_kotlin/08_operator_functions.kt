fun main() {

    // Declara operator function para sobrecarregar o operador *
    operator fun Int.times(str: String) = str.repeat(this)
    
    // Exemplo de uso
    println(2 * "Bye ")

    // Declara operator function para criar uma substring
    // sempre que uma string for acessada com um range de strings
    operator fun String.get(range: IntRange) = substring(range)
    
    // Exemplo de uso
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])

}