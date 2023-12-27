// Criando funções para comer e assar um bolo
fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")


fun main() {
    // Criando variáveis para armazenar o número de bolos comidos e assados
    var cakesEaten = 0
    var cakesBaked = 0
    
    // Enquanto os bolos comidos forem menor do qe 5
    while (cakesEaten < 5) {                    // 1
        // Imprime na tela a mensagem de "eat a cake"
        eatACake()
        // Incrementa a variável de bolos comidos
        cakesEaten ++
    }
    
    // Do While realiza a operação antes de verificar
    // a condição
    do {                                        // 2
        // Asse um bolo
        bakeACake()
        // Incrementa numero de bolos assados
        cakesBaked++
        // Depois realiza a verificação
    } while (cakesBaked < cakesEaten)

}