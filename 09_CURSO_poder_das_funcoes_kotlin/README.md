# O Poder das Funções em Kotlin

Para quê?: Aprender sobre funções Kotlin
GitHub: <https://github.com/marlonprado04/BOOTCAMP_backend_com_kotlin/tree/main/09_CURSO_poder_das_funcoes_kotlin>
Conteúdos DB: Kotlin (<https://www.notion.so/Kotlin-c848ec969da34f13b537af3274acc0ff?pvs=21>)
Plano de estudos DB: Backend com Kotlin  (<https://www.notion.so/Backend-com-Kotlin-bb7bbc8a2a3443ed9470a119aa6e2d30?pvs=21>)
Categoria: Curso
Status: Done
Criado em: January 5, 2024 3:43 PM
Modificado em: January 15, 2024 5:14 PM
Data: 05/01/2024

## Índice

- [O Poder das Funções em Kotlin](#o-poder-das-funções-em-kotlin)
  - [Índice](#índice)
  - [Antes de começar](#antes-de-começar)
  - [Apresentação](#apresentação)
    - [Introdução e objetivos](#introdução-e-objetivos)
  - [Funções de escopo](#funções-de-escopo)
    - [Let](#let)
    - [Run](#run)
    - [With](#with)
    - [Apply](#apply)
    - [Also](#also)
  - [Tipos de Funções](#tipos-de-funções)
    - [Infix Functions](#infix-functions)
    - [Operator Functions](#operator-functions)
    - [**Higher Order Functions Parameters**](#higher-order-functions-parameters)
    - [Lambda Functions](#lambda-functions)
    - [Extension Functions e Properties](#extension-functions-e-properties)
    - [Extension Functions Generics](#extension-functions-generics)
    - [Suspend Functions](#suspend-functions)
  - [Materiais de apoio e referências](#materiais-de-apoio-e-referências)

## Antes de começar

- [x]  Criar pasta referente ao curso
- [x]  Adicionar link da pasta nos atributos do curso
- [x]  Adicionar arquivos e links adicionais ao repositório (pdf, pptx, etc)

## Apresentação

### Introdução e objetivos

Neste curso vamos nos aprofundar nas funções e específicas que Kotlin fornece com todas as suas facilidades.

Vamos continuar usando os exemplos fornecidos pela documentação oficial do Kotlin, [neste link](https://play.kotlinlang.org/byExample/overview).

- Algumas das funções de escopo que veremos são

    ![Untitled](./.for_readme/Untitled.png)

- Também vamos ver alguns tipos de funções, por exemplo

    ![Untitled](./.for_readme/Untitled%201.png)

## Funções de escopo

### Let

O Let pode ser usada como uma função de escopo e também como uma função de verificação de nulidade.

O Let gera um retorno, mas muitas vezes este retorno é inutilizado.

Abaixo alguns exemplos de uso do let tanto para verificação de nulidade quanto para funções de escopo único:

```kotlin
// Cria função que retorna uma string em uppercase
fun customPrint(s: String) {
    print(s.uppercase())
}

fun main() {
	
    // Declara variável com valor test
    // e na sequência usa a função let para
    // chamar a função customPrint e verificar se o valor da variável está vazio
    val empty = "test".let {
        // Chama função customPrint e passa o valor da variável
        customPrint(it)
        // Verifica se o valor é vazio e retorna a informação de acordo (por ser a última operação do let)
        it.isEmpty()
    }
    // Printa mensagem após o retorno da função acima (customPrint retorna uppercase)
    println(" is empty: $empty")

    // Cria função para printar mensagem 
    fun printNonNull(str: String?) {
        // Printando mensagem, mesmo que nula
        println("Printing \"$str\":")

        // Usando um bloco de código seguro dentro do let que só executa se str não for null
        str?.let {
            print("\t")
            customPrint(it)
            println()
        }
    }

    // Executando função printNonNull com exemplo nulo e não nulo 
    printNonNull(null)
    printNonNull("my string") 

    // Cria função para usar o let 2 vezes verificando nulidade
    fun printIfBothNonNull(strOne: String?, strTwo: String?) {
        // Executando um let encadeado para verificar a nulidade de duas variáveis
        strOne?.let { firstString ->
            strTwo?.let { secondString ->
                customPrint("$firstString : $secondString")
                println()
            }
        }
    }
    
    // Exemplo de uso da função com let encadeado
    printIfBothNonNull("First","Second") 

}
```

### Run

Run e Let possuem diversas similiaridades, mas a principal diferença é que na função Run o elemento encadeado (que realizou sua chamada) é chamado como escopo da própria chamada da função, em formato de `this`.

Dessa forma, não é necessária a declaração de uma variável para trabalhar com operações dentro do escopo de Run.

Abaixo um exemplo de uso:

```kotlin
fun main() {
	// Cria função paraprintar o número de caracteres de uma string
    fun getNullableLength(ns: String?) {
        // Printa variavel passada
        println("for \"$ns\":")
        // Executa função run para informar se é vazia e retornar o tamanho 
        // total no caso de não ser
        ns?.run {
         	// Executa a verificação sem declarar uma variável
            println("\tis empty? " + isEmpty())
            println("\tlength = $length")                           
        }
    }
    
    // Realiza testes com nulo, fazio e strings
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")

}
```

### With

O With compartilha da característica de ter o `this` como elemento principal de interação com o valor passado na função, assim como o Run.

```kotlin
// Cria classe de configuração com o valor host e port
class Configuration(val host: String, val port: Int) 

fun main() {
    // Cria instância da classe configuration
    val configuration = Configuration(host = "127.0.0.1", port = 9000) 

	// Acessa o objeto com o with
    with(configuration) {
        // Printa informações do objeto
        println("$host:$port")
    }

    // Forma alternativa
    println("${configuration.host}:${configuration.port}")    
    
    // Mais uma alternativa
    configuration.run{
        println("$host:$port")
    }

    // Outra forma alternativa
    configuration.let{
        println("${it.host}:${it.port}")
    }
    
}
```

### Apply

O Apply é permite fazer atribuições a partir de um objeto.

Por exemplo:

```kotlin
// Define classe pessoa com alguns atributos
data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

fun main() {
    // Instanciando classe pessoa sem construtor
    val jake = Person()

    // Definindo variável a partir do objeto criado e usando o apply
    val stringDescription = jake.apply {
        // Atribuindo os valores das propriedades da instância do objeto
        name = "Jake"
        age = 30
        about = "Android developer"
    }.toString()

    // Printando valores
    println(stringDescription)
    println(jake)
}
```

### Also

A Also é muito similar ao Apply, mas da mesma forma que o Let e o Run, a principal diferença é que em Also é necessário declara o valor do item:

```kotlin
// Define classe pessoa
data class Person(var name: String, var age: Int, var about: String) {
    constructor() : this("", 0, "")
}

// Define função para criar um log de escrita
fun writeCreationLog(p: Person) {
    println("A new person ${p.name} was created.")              
}

fun main() {
    // Cria instância da classe pessoa
    val jake = Person("Jake", 30, "Android developer")
    
    // Utiliza also para realizar executar a função global
    jake.also {
        writeCreationLog(it)
    }

}
```

## Tipos de Funções

### Infix Functions

Infix Functions tem a função de permitir tornar o código mais legível, substituindo uma lógica complexa por esta função entre a interação de elementos.

Exemplos de uso:

```kotlin
fun main() {
    // Define infix function para receber um int e uma string
    // e replicar o número de vezes especificado pelo int
    infix fun Int.times(str: String) = str.repeat(this)

    // Exemplo de uso
    println(2 times "Bye ") // Imprime "Bye " 2 vezes

    // Cria variável pair e utiliza a infix function nativa "to" para criar uma
    // estrutura de dados que ferrari pertence katrina
    val pair = "Ferrari" to "Katrina"

    // Exemplo de resultado
    println(pair)

    // Cria exemplo de infix funcion identico ao anterior
    // que recebe 2 strings
    infix fun String.onto(other: String) = Pair(this, other)
    
    // Exemplo de uso
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("Sophia")
    val claudia = Person("Claudia")
    sophia likes claudia 
    }

// Cria casse pessoa com construtor de nome
class Person(val name: String) {
    // Cria variável de lista mutável do tipo pessoa
    val likedPeople = mutableListOf<Person>()
    // Cria infix function para adicionar uma pessoa à lista de outra
    infix fun likes(other: Person) { likedPeople.add(other) }
}
```

### Operator Functions

Operator Functions servem para sobrecarregar operadores em Kotlin, gerando assim uma nova funcionalidade substituida:

```kotlin
fun main() {

    // Declara operator function para sobrecarregar o operador *
    operator fun Int.times(str: String) = str.repeat(this)
    
    // Exemplo de uso
    println(2 * "Bye ")

    // Declara operator function para criar uma substring
    // sempre que uma string for acessada com um range de strings
    operator fun String.get(range: IntRange) = substring(range)
    
    // Exemplo de uso
    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14])

}
```

### **Higher Order Functions Parameters**

As higher Order functions podem receber e retornar outras funções como parâmetro.

```kotlin
// Função operation retorna uma outra função
fun operation(): (Int) -> Int {
    return ::square
}

// Função que calcula o quadrado de um número 
fun square(x: Int) = x * x

fun main() {
    // Executando função
    val func = operation()
    println(func(2))
}
```

### Lambda Functions

As expressões lambda servem para facilitar a declaração e uso de funções de forma mais dinâmica e flexível:

```kotlin
fun main() {

    // Todos os exemplos abaixo criam uma função para deixar as strings em uppercase
    val upperCase1: (String) -> String = { str: String -> str.uppercase() }
    val upperCase2: (String) -> String = { str -> str.uppercase() }
    val upperCase3 = { str: String -> str.uppercase() }
    // val upperCase4 = { str -> str.uppercase() }
    val upperCase5: (String) -> String = { it.uppercase() }
    val upperCase6: (String) -> String = String::uppercase

    println(upperCase1("hello"))
    println(upperCase2("hello"))
    println(upperCase3("hello"))
    println(upperCase5("hello"))
    println(upperCase6("hello"))

}
```

### Extension Functions e Properties

Podemos extender funções e propriedades a partir de classes existentes, sem que seja necessário declarar isso dentro da classe:

```kotlin
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
```

### Extension Functions Generics

Podemos usar Extension Functions de forma genérica também, por exemplo:

```kotlin
// Criando extensão para qualquer tipo informando que ela pode ser nula
// e que quando for nulo vai mandar a mensagem específica
fun <T> T?.nullSafeToString() = this?.toString() ?: "AUSÊNCIA DE VALOR"

fun main() {
    // Executando
    println(null.nullSafeToString())
    println("Kotlin".nullSafeToString())
}
```

### Suspend Functions

Também existem as Suspend Functions que não fazem parte da documentação oficial do Kotlin.

Elas servem para executar códigos de forma assíncrona e são muito úteis para isso.

```kotlin
// Exemplo de suspend functions com Coroutines
 
import kotlinx.coroutines.*

// Criando bloco assincrono de função
fun main() = runBlocking {
    // Executando a criação de mundo
    doWorld()
}

// Criando suspend function para executar um código de forma assincrona
suspend fun doWorld() = coroutineScope {
    // Imprimindo o World com um delay de 1 segundo
    launch {
        delay(1000L)
        println("World!")
    }

    // Imprimindo o Hello sem delay
    print("Hello ")
}
```

## Materiais de apoio e referências

Documentação do Kotlin com exemplos, [neste link](https://play.kotlinlang.org/byExample/overview)

Repositório da DIO, [neste link](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos)

Slides:

[Apresentação.pdf](./.for_readme/Apresentao.pdf)
