// Cria classe enum valores RGB padrão
// e recebe valor no construtor
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);
	
    // Cria função para verificar se a cor passada
    // na construção possui vermelho
    fun containsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main() {
    // Cria variável com a cor RED já definida no enum
    val red = Color.RED
    
    // Printa a variável (vem a informação literal do enum)
    println(red) // RED
    
    // Verificando se as cores criadas possuem vermelho 
    // em suas informação
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())
}