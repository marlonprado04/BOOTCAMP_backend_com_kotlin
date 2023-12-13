// Declarando função para imprimir uma mensagem passada via parâmetro
// E definindo o tipo da variável de parâmetro como uma string
// Neste caso é uma função que não retorna nada, sendo assim podemos:
// 1. Deixar o retorno em branco
// 2. Informar o retorno como Unit, mas essa informação é declarada de forma implícita
fun printMessage(message: String): Unit {                              
    println(message)
}

// Função para imprimir mensagem com prefixo
// Atribuindo o valor padrão do prefixo como "Info"
fun printMessageWithPrefix(message: String, prefix: String = "Info") { 
    // Podemos interpolar variáveis dentro de uma string
    println("[$prefix] $message")
}

// Função para somar dois valores inteiros e retornar um valor inteiro
fun sum(x: Int, y: Int): Int {                                         
    return x + y
}

// Função em linha (inline function)
// Essa função faz a multiplicação de 2 valores inteiros e retorna o resultado
fun multiply(x: Int, y: Int) = x * y                                   

// Função main para executar os códigos acima
fun main() {
    // Iprimindo mensagem simples
    printMessage("Hello") 
    // Imprimindo mensagem com prefixo "log"                                                              
    printMessageWithPrefix("Hello", "Log")     
    // Imprimindo mensagem com prefixo padrão                                                              
    printMessageWithPrefix("Hello")     
    // Imprimindo mensagem e invertendo os valores de parâmetro ao nomear eles na ordem inversa                               
    printMessageWithPrefix(prefix = "Log", message = "Hello")          
    println(sum(1, 2))                                                 
    println(multiply(2, 4))                                           
}