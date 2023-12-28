// Cria variável imutável como um Conjunto mutável
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // 1

// Adiciona elemento no conjunto mutável
fun addIssue(uniqueDesc: String): Boolean {                                                       
    return openIssues.add(uniqueDesc)                                                             // 2
}

// Verifica o log na hora de adicionar um elemento no conjunto
fun getStatusLog(isAdded: Boolean): String {                                                       
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."          // 3
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2" 

    // Imprime o resultado da tentativa de adicionar um elemento novo
    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}") 
    
    // Imprime o resultado da tentativa de adicionar um elemento duplicado
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")                // 5 
}