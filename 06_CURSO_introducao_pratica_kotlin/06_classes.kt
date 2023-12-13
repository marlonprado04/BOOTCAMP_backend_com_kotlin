// Para declarar classes usamos a palavra reservada class
class Customer

// Podemos definir um construtor para uma classe conforme abaixo
class Contact(val id: Int, var email: String)

fun main() {
    // Criando uma instância da classe Customer
    // Repare que não é necessário usar o "new"
    val customer = Customer()
    
    // Criando instância da classe Contact
    val contact = Contact(1, "mary@gmail.com")

    // Printando o ID do contact que é imutável (declarado como val)
    println(contact.id)
    // Modificando o email da instância de contato
    contact.email = "jane@gmail.com"
}