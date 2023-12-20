fun main() {
    // Essa variável nunca poderá ser null0
    var neverNull: String = "This can't be null"            // 1
    // Ao tentar atribuir null à variável, aponta erro de compilação
    neverNull = null                                        // 2

    // Caso queiramos deixar a possibilidade de atribuir um valor null à variável
    // devemos adicionar um ? ao fim do tipo
    var nullable: String? = "You can keep a null here"      // 3
    // Ao tentar atribuir null à variável o sistema aceita
    nullable = null                                         // 4

    // Ao não tipar a variável mas passar um valor para ela, o compilador
    // também infere que ela não deve aceitar null
    
    // Se quisermos permitir que a variável aceite null devemos declarar explicitamente o tipo
    var inferredNonNull = "The compiler assumes non-null"   // 5
    // Ao tentar atribuir valor null à variável não tipada, dá erro
    inferredNonNull = null                                  // 6

    // O bloqueio de null também vale para parâmetros de funções
    fun strLength(notNull: String): Int {
        return notNull.length
    }

    // Ao tentar passar um valor que não pode ser nulo como parâmetro de uma função
    // que não aceita null, o sistema aceita 
    strLength(neverNull)
    // mas ao tentar passar o valor que pode ser null, o sistema da erro
    strLength(nullable)
}

