// Criando duas data class
data class Item(val name: String, val price: Float)
data class Order(val items: Collection<Item>)  

// Criando extension functions de Order para filtrar o item com maior preço 
// pelo buscando preço e nome
fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: "NO_PRODUCTS"

// Declarando uma propriedade dentro de Order 
// com os nomes dos istens separados por virgula
val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()

fun main() {
    // Declarando itens de exemplo
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))
    
    // Executando funções e propriedades extendidas
    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")

}