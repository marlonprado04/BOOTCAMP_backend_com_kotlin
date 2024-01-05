// Cria função que retorna uma string em uppercase
fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {
	
    // Declara variável com valor test
    // e na sequência usa a função let para
    // chamar a função customPrint e verificar se o valor da variável está vazio
    val empty = "test".let {
        // Chama função customPrint e passa o valor da variável
        customPrint(it)
        // Verifica se o valor é vazio e retorna a informação de acordo (por ser a última operação do let)
        it.isEmpty()
    }
    // Printa mensagem após o retorno da função acima (customPrint retorna uppercase)
    println(" is empty: $empty")

    // Cria função para printar mensagem 
    fun printNonNull(str: String?) {
        // Printando mensagem, mesmo que nula
        println("Printing \"$str\":")

        // Usando um bloco de código seguro dentro do let que só executa se str não for null
        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }

    // Executando função printNonNull com exemplo nulo e não nulo 
    printNonNull(null)
    printNonNull("my string") 

    // Cria função para usar o let 2 vezes verificando nulidade
    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        // Executando um let encadeado para verificar a nulidade de duas variáveis
        strOne?.let { firstString ->
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }
    
    // Exemplo de uso da função com let encadeado
    printIfBothNonNull("First","Second") 

}