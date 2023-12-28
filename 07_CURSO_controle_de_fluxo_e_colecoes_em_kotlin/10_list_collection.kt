// Cria uma variável imutável que armazena uma lista mutável
// ou seja, podemos adicionar e remover elementos dentro da variável
// sem alterar o tipo de variável
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)

// Adiciona valores da mutableList à uma variável
// imutável, ou seja, uma cópia que só visualiza
val sudoers: List<Int> = systemUsers

// Cadastra um novo usuário na variável
// com lista mutável
fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)                      
}

// Retorna a lista de usuários da lista imutável
fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    // Adiciona usuário com id 4
    addSystemUser(4)
    
    // Imprime o tamanho total da lista imutável
    println("Tot sudoers: ${getSysSudoers().size}")
    
    // Percorre a lista imutável
    getSysSudoers().forEach {
        // Imprime o ID percorrido
        i -> println("Some useful info on user $i")
    }
    // Exemplo de erro ao tentar adicionar à lista imutável
    // getSysSudoers().add(5) <- Error!
}