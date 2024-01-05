
// Exemplo de uso: Object Expression

// Cria função para calcular o preço 
fun rentPrice(standardDays: Int, festivityDays: Int, specialDays: Int): Unit {
	// Cria variável com um objeto que armazena os preços
    // de acordo com o tipo de dia
    val dayRates = object {
        var standard: Int = 30 * standardDays
        var festivity: Int = 50 * festivityDays
        var special: Int = 100 * specialDays
    }
	
    // Cria variável com total que acessa as propriedades da variável acima
    // como se fosse um objeto propriamente dito
    val total = dayRates.standard + dayRates.festivity + dayRates.special

    print("Total price: $$total")

}

fun main() {
    // Exemplo de uso
    rentPrice(10, 2, 1)
}

// ------------------------------------------

// Exemplo de uso: Object Declaration

// Cria classe de instância única utilizando a palavra reservada object
object DoAuth {
    // Cria função para imprimir os parâmetros
    fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}

fun main(){
    // Exemplo de uso
    DoAuth.takeParams("foo", "qwerty")
}

// ------------------------------------------

// Exemplo de uso: Companion Objects

class BigBen {
    // Cria companion object que serve para criar uma função 
    // estática que permite acesso sem declaração de instância
    // da classe BigBen
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            for (i in 1 .. nTimes) {
                print("BONG ")
            }
        }
    }
}

fun main() {
    // Acessando o método dentro do companion object
    // sem a necessidade de uma instância
    BigBen.getBongs(12)
}