// Cria uma exceção específica para voto 
class IllegalVoterException(message: String) : Throwable(message)

// Função para simular um voto
@Throws(IllegalVoterException::class)
fun vote(name: String, age: Int){
    // Verifica idade da pessoa
    if (age < 16){
        throw IllegalVoterException("$name você não pode votar!")
    }
    println("Voto de $name realizado com sucesso!")
}

fun main() {
    vote("Marlon", 23);
    vote("Joana", 15)
}