// Definindo uma classe que recebe um parãmetro genérico E
// e como parâmetro recebe um vararg de E
class MutableStack<E>(vararg items: E) {

    // Armazenando o arra de itens passado ao construir a classe
    // dentro da variável elementos após tranformar o array em uma lista mutável 
    // com o método padrão do Kotlin toMutableList()
    private val elements = items.toMutableList()

    // Função para adicionar elemento na pilha criada
    fun push(element: E) = elements.add(element)

    // Função para espiar o último elemento adicionado
    fun peek(): E = elements.last()

    // Função para remover o último elemento
    fun pop(): E = elements.removeAt(elements.size - 1)

    // Função para verificar se a pilha está vazia
    fun isEmpty() = elements.isEmpty()

    // Função para mostrar o tamanho da pilha
    fun size() = elements.size

    // Função para converter a pilha em string
    override fun toString() = "MutableStack(${elements.joinToString()})"
}
  
fun main() {
    // Instanciano uma pilha de elementos
    val stack = MutableStack(0.62, 3.14, 2.7)
    // Adicionando elemento ao final da pilha
    stack.push(9.87)
    // Listando a pilha criada
    println(stack)

    // Demonstrando a saída do método peek()
    println("peek(): ${stack.peek()}")
    // Demonstrando a pilha após o peek() (continua igual)
    println(stack)

    // Varrendo toda a pilha e removendo item a item
    // ao definir o range de 1 até o tamanho da pilha
    // 1..tamanho.da.pilha()
    for (i in 1..stack.size()) {
      println("pop(): ${stack.pop()}")
      println(stack)
    }
}