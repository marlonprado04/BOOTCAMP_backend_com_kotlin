// Exemplo de suspend functions com Coroutines
 
import kotlinx.coroutines.*

// Criando bloco assincrono de função
fun main() = runBlocking {
    // Executando a criação de mundo
    doWorld()
}

// Criando suspend function para executar um código de forma assincrona
suspend fun doWorld() = coroutineScope {
    // Imprimindo o World com um delay de 1 segundo
    launch {
        delay(1000L)
        println("World!")
    }

    // Imprimindo o Hello sem delay
    print("Hello ")
}