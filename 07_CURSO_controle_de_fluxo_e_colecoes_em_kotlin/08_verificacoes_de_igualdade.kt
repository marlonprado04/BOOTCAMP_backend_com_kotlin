fun main() {
    
    // Duas sets (que não aceitam itens duplicados) com os mesmos
    // valores, porém em ordens diferentes 
    val authors = setOf("Shakespeare", "Hemingway", "Twain")
    val writers = setOf("Twain", "Shakespeare", "Hemingway")
  
    // Ao fazer uma comparação estrutural (com 2 iguais)
    // retorna true, pois elas possuem a mesma estrutura de elementos
    println(authors == writers)
    
    // Ao fazer uma comparação referencial (com 3 iguais)
    // retorna false, pois elas não possuem a mesma referência de valores
    println(authors === writers)

  }