// Declara data class de usuário
data class User(val name: String, val id: Int) {
    // Função para comparar somente o id via equals 
    override fun equals(other: Any?) =
        other is User && other.id == this.id
}

fun main() {
    // Cria usuário
    val user = User("Alex", 1)
    
    // Printa valores da classe instanciada
    println(user) // User(name=Alex, id=1)
    
    // Cria um usuário igual ao primeiro
    val secondUser = User("Alex", 1) // true
    // Cria um usuário diferente do primeiro
    val thirdUser = User("Max", 2) // false

    // Printa a comparação entre usuários
    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // Usando função hashCode para gerar o ID único a partir das variáveis de cada classe
    println(user.hashCode()) 
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // Usando função copy para gerar uma cópia de instância sem usar a mesma referência na memória
    println(user.copy())
    // Printando resultado da comparação de endereço do usuário com a cópia dele 
    println(user === user.copy())
    // Printando cópia de usuário e modificando nome na hora de copiar
    println(user.copy("Max"))
    // printando cópia e modificando o ID
    println(user.copy(id = 3))

    // Printando os componentes de acordo com a ordem de declarção
    println("name = ${user.component1()}") // Alex
    println("id = ${user.component2()}") // 1
}