// Cria uma constante imutável com o número de pontos ganhos
const val POINTS_X_PASS: Int = 15

// Cria um mapa mutável de int: int e atribui os valores em seguida
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // 1
// Cria um mapa imutável para receber valores do mapa mutável
val EZPassReport: Map<Int, Int> = EZPassAccounts                                        // 2

// Adiciona pontos à conta com o ID passado caso exista
fun updatePointsCredit(accountId: Int) {
    // Verifica existencia da conta com o ID passado
    if (EZPassAccounts.containsKey(accountId)) {                                        // 3
        println("Updating $accountId...")                                               
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // 4
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    } 
}

// Imprime todas as contas criadas
fun accountsReport() {
    println("EZ-Pass report:")
    
    // Varre a lista completa e imprime mensagem com id e crédido 
    EZPassReport.forEach {                                                              // 5
        k, v -> println("ID $k: credit $v")
    }
}

fun main() {
    // Imprime a lista de contas existentes
    accountsReport()
    // Atualiza os créditos da conta 1 duas vezes                                                                    // 6
    updatePointsCredit(1)                                                               // 7
    updatePointsCredit(1)                                                               
    // Atualiza os créditos de uma conta inexistente
    updatePointsCredit(5)                                                               // 8 
    // Imprime a lista de contas existentes
    accountsReport()                                                                    // 9
}