
fun main(){
    // A palavra-chave 'vararg' permite a entrada de uma quantidade variável de valores do mesmo tipo.
    // Não é necessário declarar explicitamente um array e passá-lo como parâmetro
    fun printAll(vararg messages: String) {                      
        // Para cada mensagem no array 'messages', imprime-a na tela
        for (m in messages) println(m)
    }

    // Exemplo de uso da função 'printAll' com diferentes mensagens
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
         

    // Podemos aproveitar a nomeação de argumentos para separar as informações
    // passadas na chamada da função 
    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }

    // Exemplo de chamada da função passando o argumento nomeado ao final
    // depois de passar todas as mensagens
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )

    // O passar uma lista recebida em vararg para outro método que recebe vararg
    // é necessário definir um (*) na passagem do valor
    // caso contrário ele será passado como array 
    fun log(vararg entries: String) {
        printAll(*entries)                                             // 5
    }
    
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}