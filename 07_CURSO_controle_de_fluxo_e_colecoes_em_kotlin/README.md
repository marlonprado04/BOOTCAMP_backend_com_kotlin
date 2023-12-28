# Estruturas de Controle de Fluxo e Coleções em Kotlin

Para quê?: Me aprofundar nas particularidades de Kotlin
GitHub: <https://github.com/marlonprado04/BOOTCAMP_backend_com_kotlin/tree/main/07_CURSO_controle_de_fluxo_e_colecoes_em_kotlin>
Conteúdos DB: Kotlin (<https://www.notion.so/Kotlin-c848ec969da34f13b537af3274acc0ff?pvs=21>)
Categoria: Curso
Status: Done
Plano de estudos DB: Backend com Kotlin  (<https://www.notion.so/Backend-com-Kotlin-bb7bbc8a2a3443ed9470a119aa6e2d30?pvs=21>)
Criado em: December 20, 2023 9:26 PM
Modificado em: December 28, 2023 4:45 PM

## Índice

- [Estruturas de Controle de Fluxo e Coleções em Kotlin](#estruturas-de-controle-de-fluxo-e-coleções-em-kotlin)
  - [Índice](#índice)
  - [Antes de começar](#antes-de-começar)
  - [Apresentação](#apresentação)
    - [Introdução e objetivos](#introdução-e-objetivos)
  - [Controle de Fluxo](#controle-de-fluxo)
    - [When Statement](#when-statement)
    - [When Expression](#when-expression)
    - [Loops: For](#loops-for)
    - [Loops: While e do While](#loops-while-e-do-while)
    - [Loops: Iterators](#loops-iterators)
    - [Ranges: Loops com Int](#ranges-loops-com-int)
    - [Ranges: Ifs e loops com Char](#ranges-ifs-e-loops-com-char)
    - [Verificações de Igualdade == e ===](#verificações-de-igualdade--e-)
    - [Expressão condicional](#expressão-condicional)
  - [Coleções](#coleções)
    - [Listas (List)](#listas-list)
    - [Conjuntos (Set)](#conjuntos-set)
    - [Mapas (Map)](#mapas-map)
  - [Materiais de apoio e referências](#materiais-de-apoio-e-referências)

## Antes de começar

- [x]  Criar pasta referente ao curso
- [x]  Adicionar link da pasta nos atributos do curso
- [x]  Adicionar arquivos e links adicionais ao repositório (pdf, pptx, etc)

## Apresentação

### Introdução e objetivos

O objetivo deste curso é apresentar elementos da estrutura de controle de fluxo e coleções em Kotlin.

No curso vamos explorar as principais estruturas de controle de fluxo e coleções em Kotlin.

Este curso seguirá o exemplo anterior com uma pegada mais mão na massa.

Vamos seguir explorando os exemplos da documentação oficial [deste link](https://play.kotlinlang.org/byExample/overview)

O que vamos aprender neste curso inclui:

- Controle de fluxo
    - When
    - Loops
    - Ranges
    - Verificações de igualdade
    - Expressões condicionais
- Coleções
    - Listas (List)
    - Conjuntos (Set)
    - Mapas (Map)
    - Extension Functions (filter, map, flatmap, etc)

## Controle de Fluxo

### When Statement

O `when` possui duas formas de uso no Kotlin. Uma opção é declarativa e a outra é usada com a expressão when.

When é similar ao Switch Case de outras linguagens, porém muito mais flexível.

Abaixo um exemplo de código:

```kotlin
fun main() {
    // Chamando a função "cases" e passando algo como parâmetro
    cases("Hello")
    cases(1)
    cases(0L)
    cases(MyClass())
    cases("hello")
}

// Criando função "cases" que recebe um objeto de qualquer tipo como parâmetro
fun cases(obj: Any) {                                
    // Chamando o "when" e passando o objeto recebido como parâmetro
    when (obj) {                                     // 1
        // Se o objeto for 1, imprime "one"
        1 -> println("One")                          // 2
        // Se o objeto for "Hello", imprime "Greeting"
        "Hello" -> println("Greeting")               // 3
        // Se for do tipo long, imprime "Long"
        is Long -> println("Long")                   // 4
        // Se não for do tipo "String", imprime "not a string"
        !is String -> println("Not a string")        // 5
        // Senão, imprime "unknown"
        else -> println("Unknown")                   // 6
    }   
}

// Criando classe simbólica para passar como parâmetro
class MyClass
```

No exemplo acima criamos uma função que recebe algo como parâmetro e dentro dela verificamos o que foi passado e imprimimos uma mensagem de acordo.

É similar ao “switch / case” de outras linguagens, mas com o diferencial de permitir outros tipos de validação.

### When Expression

Abaixo um exemplo de uso do when em Kotlin como expressão:

```kotlin
fun main() {
    println(whenAssign("Hello"))
    println(whenAssign(3.4))
    println(whenAssign(1))
    println(whenAssign(MyClass()))
}

// Criando função que receve qualquer tipo de parâmetro e retorna qualquer tipo 
fun whenAssign(obj: Any): Any {
    // Atribui o resultado do "when" para a variável result criada
    val result = when (obj) {                   // 1
        1 -> "one"                              // 2
        "Hello" -> 1                            // 3
        is Long -> false                        // 4
        else -> 42                              // 5
    }
    return result
}

class MyClass
```

### Loops: For

Exemplo de sintaxe do For:

```kotlin
fun main() {
	// Criando lista de bolos através da função implícita "listOf"
    val cakes = listOf("carrot", "cheese", "chocolate")
    
    // Percorrendo cada bolo dentro da lista de bolos
    // Para cada bolo da lista, imprime a mensagem
    for (cake in cakes) {                               // 1
        println("Yummy, it's a $cake cake!")
    }

}
```

### Loops: While e do While

Exemplos de uso do While e Do While:

```kotlin
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
```

### Loops: Iterators

Exemplo de criação de função do tipo Iterator para iterar os valores / objetos de uma classe:

```kotlin
// Classe animal
class Animal(val name: String)

// Classe zoológico que recebe uma lista de animais
class Zoo(val animals: List<Animal>) {

    // Operator fun permite que a classe zoo seja iterada
    operator fun iterator(): Iterator<Animal> {             // 1
        // Retorna a lista de animais iterada
        return animals.iterator()                           // 2
    }
}

fun main() {
	// Cria uma lista de animais
    val animals = listOf(Animal("Zebra"), Animal("Leao"))
    
    // Instancia a classe "zoo" e passa a lista de animais
    val zoo = Zoo(animals)
	
    // Itera na lista de animais dentro da instância "zoo"
    for (animal in zoo) {
        // Printa o nome do animal da iteração atual
        println("Watch out, it's a ${animal.name}")
    }

}
```

### Ranges: Loops com Int

O Kotlin permite incrementar e decrementar a partir de ranges, permitindo assim dar mais organização e legibilidade para o código.

Abaixo exemplos de sintaxes de range:

```kotlin
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
```

### Ranges: Ifs e loops com Char

Podemos usar os ranges com chats e também realizando validações com ifs

Abaixo exemplos de sintaxe:

```kotlin
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
```

### Verificações de Igualdade == e ===

No Kotlin existem 2 comparadores de igualdade.

Um deles compara somente a estrutura dos elementos e outro compara a referência na memória:

```kotlin
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
```

### Expressão condicional

Abaixo um exemplo de código de expressão condicional:

```kotlin
fun main() {
	// Função para retonrar o maior valor dos dois passados
    fun max(a: Int, b: Int) = if (a > b) a else b         // 1

    // Função na sintaxe antiga
    fun maxOld(a: Int, b: Int): Int{
        if (a > b){
            return a
        } else{
            return b
        }
    }
    
    // Executando ambas funções
    println(max(99, -42))
    println(maxOld(99, -42))

}
```

## Coleções

### Listas (List)

Em Kotlin uma lista é:

- Uma estrutura de dados **ordenada**
- Podemos ter listas mutáveis e imutáveis de **acordo com a instância criada**
    - `listOf()` → Cria uma lista imutável
    - `mutableListOf()` → Cria uma lista mutável

No exemplo abaixo estamos criando tanto uma lista mutável quanto uma lista imutável do tipo genérico `int`, porém a lista imutável recebe apenas uma cópia da lista mutável.

Dessa forma, ao adicionar elementos na lista mutável essa mudança é refletida na lista imutável e ao percorrer os elementos da lista imutável, a mudança anterior aparece:

```kotlin
// Cria uma variável imutável que armazena uma lista mutável
// ou seja, podemos adicionar e remover elementos dentro da variável
// sem alterar o tipo de variável
val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)

// Adiciona valores da mutableList à uma variável
// imutável, ou seja, uma cópia que só visualiza
val sudoers: List<Int> = systemUsers

// Cadastra um novo usuário na variável
// com lista mutável
fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)                      
}

// Retorna a lista de usuários da lista imutável
fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    // Adiciona usuário com id 4
    addSystemUser(4)
    
    // Imprime o tamanho total da lista imutável
    println("Tot sudoers: ${getSysSudoers().size}")
    
    // Percorre a lista imutável
    getSysSudoers().forEach {
        // Imprime o ID percorrido
        i -> println("Some useful info on user $i")
    }
    // Exemplo de erro ao tentar adicionar à lista imutável
    // getSysSudoers().add(5) <- Error!
}
```

### Conjuntos (Set)

Set (conjuntos) em Kotlin são estruturas de dados similares às listas, porém:

- Não são ordenados como as listas;
- Não permitem valores duplicados.
- Podemos criar conjuntos mutáveis e imutáveis:
    - `mutableSetOf()` → Cria um conjunto mutável
    - `setOf()` → Cria um conjunto imutável

Abaixo um exemplo de código utilizando set:

```kotlin
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
```

### Mapas (Map)

Em Kotlin as coleções do tipo map:

- São elementos com chave / valor
- Possui a mesma característica de permitir criação de mapas mutáveis e imutáveis

Abaixo um exemplo de um mapa com ID e valor de créditos em uma conta:

```kotlin
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
```

## Materiais de apoio e referências

- Documentação de exemplos do Kotlin, [neste link](https://play.kotlinlang.org/byExample/overview).
- Repositório da DIO com exemplos deste curso, [neste link](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos)
- Slides do curso, abaixo:

    [Slides.pdf](./.for_readme/Slides.pdf)
