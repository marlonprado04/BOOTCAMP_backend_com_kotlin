// Cria classe de configuração com o valor host e port
class Configuration(val host: String, val port: Int) 

fun main() {
    // Cria instância da classe configuration
    val configuration = Configuration(host = "127.0.0.1", port = 9000) 

	// Acessa o objeto com o with
    with(configuration) {
        // Printa informações do objeto
        println("$host:$port")
    }

    // Forma alternativa
    println("${configuration.host}:${configuration.port}")    
    
    // Mais uma alternativa
    configuration.run{
        println("$host:$port")
    }

    // Outra forma alternativa
    configuration.let{
        println("${it.host}:${it.port}")
    }
    
}