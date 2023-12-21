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

// Função de tipo genérico que cria uma nova MutableStack com os elementos passados
// e passa os elementos como vararg (usando *) ao invés de 
// passar um array definido
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    // Criando variável para armazenar o resultado
    // da função genérica, ou seja, uma pilha de elementos
    // genéricos criados
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)

    println(stack.size())
}