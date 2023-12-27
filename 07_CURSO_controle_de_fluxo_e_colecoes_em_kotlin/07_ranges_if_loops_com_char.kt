fun main() {

    // Incrementa variável c (char) de 'a' até 'd'
    for (c in 'a'..'d') {        // 1
        print(c)
    }
    print(" ")

    // Decrementa variável c (char) de 'z' até 's', de 2 em 2
    for (c in 'z' downTo 's' step 2) { // 2
        print(c)
    }
    print(" ")

    // Variável imutável com valor 2
    val x = 2
    
    // Verificando se variável está dentro do range 1 até 5
    if (x in 1..5) {            // 1
        print("x is in range from 1 to 5")
    }
    println()

    // Verificando se variável NÃO está dentro do range de 6 até 10
    if (x !in 6..10) {          // 2
        print("x is not in range from 6 to 10")
    }
}