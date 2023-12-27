fun main() {

    // Iterando i de 0 até 3 (inclusive 3)
    for(i in 0..3) {             // 1
        print(i)
    }
    
    print(" ")

    // Iterando i de 0 até 3 (sem considerar o 3)
    for(i in 0 until 3) {        // 2
        print(i)
    }
    print(" ")

    // Iterando i de 2 até 8 em passos de 2 em 2
    for(i in 2..8 step 2) {      // 3
        print(i)
    }
    print(" ")

    // Iterando i de 3 até 0 (inclusive 0)
    for (i in 3 downTo 0) {      // 4
        print(i)
    }
    print(" ")


}