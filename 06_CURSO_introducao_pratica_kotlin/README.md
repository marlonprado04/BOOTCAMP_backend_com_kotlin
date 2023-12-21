# Introdução Prática à Linguagem de Programação Kotlin

Para quê?: Avançar no conhecimento da linguagem Kotlin
Links: GitHub: <https://github.com/marlonprado04/BOOTCAMP_backend_com_kotlin>
Conteúdos DB: Kotlin (<https://www.notion.so/Kotlin-c848ec969da34f13b537af3274acc0ff?pvs=21>)
Categoria: Curso
Status: Done
Plano de estudos DB: Backend com Kotlin  (<https://www.notion.so/Backend-com-Kotlin-bb7bbc8a2a3443ed9470a119aa6e2d30?pvs=21>)
Criado em: December 19, 2023 3:58 PM
Modificado em: December 20, 2023 9:05 PM

## Índice

- [Introdução Prática à Linguagem de Programação Kotlin](#introdução-prática-à-linguagem-de-programação-kotlin)
  - [Índice](#índice)
  - [Antes de começar](#antes-de-começar)
  - [Apresentação](#apresentação)
    - [****Apresentação Introdução e Objetivos****](#apresentação-introdução-e-objetivos)
    - [****Elementos Práticos da Documentação Oficial do Kotlin****](#elementos-práticos-da-documentação-oficial-do-kotlin)
  - [Exemplos Práticos](#exemplos-práticos)
    - [****Olá, Mundo!****](#olá-mundo)
    - [****Funções - Valores de Parâmetro Padrão e Argumentos Nomeados****](#funções---valores-de-parâmetro-padrão-e-argumentos-nomeados)
    - [****Funções - Parâmetros vararg****](#funções---parâmetros-vararg)
    - [****Variáveis var e val****](#variáveis-var-e-val)
    - [****Null Safety Nulidade****](#null-safety-nulidade)
    - [Classes](#classes)
    - [****Generics - Classes Genéricas****](#generics---classes-genéricas)
    - [****Generics - Funções Genéricas****](#generics---funções-genéricas)
  - [Links e referências](#links-e-referências)

## Antes de começar

- [x]  Criar pasta referente ao curso
- [x]  Adicionar link da pasta nos atributos do curso
- [x]  Adicionar arquivos e links adicionais ao repositório (pdf, pptx, etc)

## Apresentação

### ****Apresentação Introdução e Objetivos****

O objetivo deste curso é colocar a mão na massa para aprender a sintaxe do Kotlin.

Vamos explorar exercícios oficiais do Kotlin que podem ser encontrados na documentação.

Durante este curso vamos aprender sobre:

- Funções do Kotlin
- Variáveis
- Null Safety
- Classes
- Generics

### ****Elementos Práticos da Documentação Oficial do Kotlin****

Durante esse curso o professor vai usar o PlayGround e os exemplos do Koan que podem ser localizados na documentação oficial do Kotlin.

## Exemplos Práticos

### ****Olá, Mundo!****

A documentação apresentada em aula está [neste link](https://play.kotlinlang.org/byExample/01_introduction/01_Hello%20world).

Abaixo um exemplo de código Kotlin:

```kotlin
// Códigos Kotlin são agrupados em pacotes. Abaixo tem um pacote sendo definido para o código atual
// Caso não seja informado o pacote, o código ficará armazenado no pacote padrão
package org.kotlinlang.play      // 1. Definição do pacote

// Desde o Kotlin 1.3 não é necessário passar nenhum parâmetro na função principal (main)
// Antes era necessário, por exemplo: "fun main(args: Array<String>)"
fun main() {         // 2. Ponto de entrada do código em Kotlin        
    // println imprime uma linha na saída padrão do Kotlin e ela já é importada automaticamente        
    println("Hello, World!")   // 3. Imprime a saída padrão em um texto pulando uma linha
}
```

### ****Funções - Valores de Parâmetro Padrão e Argumentos Nomeados****

Abaixo um código demonstrando as funções em Kotlin

```kotlin
// Declarando função para imprimir uma mensagem passada via parâmetro
// E definindo o tipo da variável de parâmetro como uma string
// Neste caso é uma função que não retorna nada, sendo assim podemos:
// 1. Deixar o retorno em branco
// 2. Informar o retorno como Unit, mas essa informação é declarada de forma implícita
fun printMessage(message: String): Unit {                              
    println(message)
}

// Função para imprimir mensagem com prefixo
// Atribuindo o valor padrão do prefixo como "Info"
fun printMessageWithPrefix(message: String, prefix: String = "Info") { 
    // Podemos interpolar variáveis dentro de uma string
    println("[$prefix] $message")
}

// Função para somar dois valores inteiros e retornar um valor inteiro
fun sum(x: Int, y: Int): Int {                                         
    return x + y
}

// Função em linha (inline function)
// Essa função faz a multiplicação de 2 valores inteiros e retorna o resultado
fun multiply(x: Int, y: Int) = x * y                                   

// Função main para executar os códigos acima
fun main() {
    // Iprimindo mensagem simples
    printMessage("Hello") 
    // Imprimindo mensagem com prefixo "log"                                                              
    printMessageWithPrefix("Hello", "Log")     
    // Imprimindo mensagem com prefixo padrão                                                              
    printMessageWithPrefix("Hello")     
    // Imprimindo mensagem e invertendo os valores de parâmetro ao nomear eles na ordem inversa                               
    printMessageWithPrefix(prefix = "Log", message = "Hello")          
    println(sum(1, 2))                                                 
    println(multiply(2, 4))                                           
}
```

Podemos notar que Kotlin tem uma característica própria da linguagem em permitir a inversão de parâmetros na chamada de funções, de forma que fique à critério do desenvolvedor.

### ****Funções - Parâmetros vararg****

Abaixo alguns detalhes do `vararg` que é um recurso específico do Kotlin.

```kotlin
fun main(){
    // A palavra-chave 'vararg' permite a entrada de uma quantidade variável de valores do mesmo tipo.
    // Não é necessário declarar explicitamente um array e passá-lo como parâmetro
    fun printAll(vararg messages: String) {                      
        // Para cada mensagem no array 'messages', imprime-a na tela
        for (m in messages) println(m)
    }

    // Exemplo de uso da função 'printAll' com diferentes mensagens
    printAll("Hello", "Hallo", "Salut", "Hola", "你好")
         

    // Podemos aproveitar a nomeação de argumentos para separar as informações
    // passadas na chamada da função 
    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }

    // Exemplo de chamada da função passando o argumento nomeado ao final
    // depois de passar todas as mensagens
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "你好",
        prefix = "Greeting: "                                          // 4
    )

    // O passar uma lista recebida em vararg para outro método que recebe vararg
    // é necessário definir um (*) na passagem do valor
    // caso contrário ele será passado como array 
    fun log(vararg entries: String) {
        printAll(*entries)                                             // 5
    }
    
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}
```

Para trabalhar com vararg é importante ter em mente que:

- Ele é um tipo de array que permite seu uso sem declaração explícita de array;
- Podemos combinar o vararg com a nomeação de argumento na chamada de uma função;
- Ao passar um vararg para outra função que recebe vararg, precisamos usar o spread operator (*) para que não seja tratado como um array tradicional

### ****Variáveis var e val****

Em Kotlin temos 2 pontos principais na declaração de variáveis, sendo eles:

- As duas formas de declarar (var e val)
- A possibilidade de definir ou não o tipo

```kotlin
fun main() {
    // Var é uma variável mutável que pode ter seus valores variados
    // Ambas podem ter seu tipo definido ou inferido pelo compilador
    var a: String = "initial"  // 1
    println(a)

    // Val é uma variável imutável, ou seja, uma constante
    val b: Int = 1
    // Permitindo inferência do compilador para o tipo
    val c = 3

    println(b)
    println(c)

}
```

No código acima, ao declarar uma variável como `val` estamos declarando uma constante que terá seu valor imutável. Podemos ou não definir o tipo da variável (tanto `var` quanto `val`) de forma que o compilador do Kotlin faça a definição por nós.

### ****Null Safety Nulidade****

Em Kotlin existe a possibilidade de evitar problemas de nulidade (Null Pointer Exception).

```kotlin
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
```

### Classes

Abaixo alguns exemplos de uso de classes:

```kotlin
// Para declarar classes usamos a palavra reservada class
class Customer

// Podemos definir um construtor para uma classe conforme abaixo
class Contact(val id: Int, var email: String)

fun main() {
    // Criando uma instância da classe Customer
    // Repare que não é necessário usar o "new"
    val customer = Customer()
    
    // Criando instância da classe Contact
    val contact = Contact(1, "mary@gmail.com")

    // Printando o ID do contact que é imutável (declarado como val)
    println(contact.id)
    // Modificando o email da instância de contato
    contact.email = "jane@gmail.com"
}
```

### ****Generics - Classes Genéricas****

Abaixo um exemplo de implementação de classe genérica, usando todos os conceitos aprendidos até então:

```kotlin
// Definindo uma classe que recebe um parãmetro genérico E
// e como parâmetro recebe um vararg de E
class MutableStack<E>(vararg items: E) {

    // Armazenando o arra de itens passado ao construir a classe
    // dentro da variável elementos após tranformar o array em uma lista mutável 
    // com o método padrão do Kotlin toMutableList()
    private val elements = items.toMutableList()

    // Função para adicionar elemento na pilha criada
    fun push(element: E) = elements.add(element)

    // Função para espiar o último elemento adicionado
    fun peek(): E = elements.last()

    // Função para remover o último elemento
    fun pop(): E = elements.removeAt(elements.size - 1)

    // Função para verificar se a pilha está vazia
    fun isEmpty() = elements.isEmpty()

    // Função para mostrar o tamanho da pilha
    fun size() = elements.size

    // Função para converter a pilha em string
    override fun toString() = "MutableStack(${elements.joinToString()})"
}
  
fun main() {
    // Instanciano uma pilha de elementos
    val stack = MutableStack(0.62, 3.14, 2.7)
    // Adicionando elemento ao final da pilha
    stack.push(9.87)
    // Listando a pilha criada
    println(stack)

    // Demonstrando a saída do método peek()
    println("peek(): ${stack.peek()}")
    // Demonstrando a pilha após o peek() (continua igual)
    println(stack)

    // Varrendo toda a pilha e removendo item a item
    // ao definir o range de 1 até o tamanho da pilha
    // 1..tamanho.da.pilha()
    for (i in 1..stack.size()) {
      println("pop(): ${stack.pop()}")
      println(stack)
    }
}
```

No código acima implementamos uma classe de estrutura de dados do tipo pilha junto de alguns métodos característicos dessa estrutura de dados.

Se fizermos a troca dos elementos passados ao construir a classe de int para string, o sistema permanece funcionando. Essa é a função de classes genéricas.

### ****Generics - Funções Genéricas****

Abaixo uma demonstração de uso de funções genéricas somado à classes genéricas:

```kotlin
// Definindo uma classe que recebe um parãmetro genérico E
// e como parâmetro recebe um vararg de E
class MutableStack<E>(vararg items: E) {

    // Armazenando o arra de itens passado ao construir a classe
    // dentro da variável elementos após tranformar o array em uma lista mutável 
    // com o método padrão do Kotlin toMutableList()
    private val elements = items.toMutableList()

    // Função para adicionar elemento na pilha criada
    fun push(element: E) = elements.add(element)

    // Função para espiar o último elemento adicionado
    fun peek(): E = elements.last()

    // Função para remover o último elemento
    fun pop(): E = elements.removeAt(elements.size - 1)

    // Função para verificar se a pilha está vazia
    fun isEmpty() = elements.isEmpty()

    // Função para mostrar o tamanho da pilha
    fun size() = elements.size

    // Função para converter a pilha em string
    override fun toString() = "MutableStack(${elements.joinToString()})"
}

// Função de tipo genérico que cria uma nova MutableStack com os elementos passados
// e passa os elementos como vararg (usando *) ao invés de 
// passar um array definido
fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    // Criando variável para armazenar o resultado
    // da função genérica, ou seja, uma pilha de elementos
    // genéricos criados
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)

    println(stack.size())
}
```

Repare que no código acima apenas fazemos a abstração da classe, criando uma função que recebe `vararg` de elementos genéricos e passa esses elementos para a construção de uma instância da classe com elementos genéricos.

## Links e referências

- Para configurar o Kotlin para uso no VSCode segui os passos deste vídeo: [Configurar VSCode para programar em Kotlin (youtube.com)](https://www.youtube.com/watch?v=m-PnqMBAfJQ&ab_channel=VaiProgramar)

- A documentação apresentada em aula está [neste link](https://play.kotlinlang.org/byExample/01_introduction/01_Hello%20world).

- O repositório original do curso com todos os códigos criados está [neste link](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos)

- O PDF com os slides do curso:

    [apresentação.pdf](./.for_readme/slides_kotlin.pdf)
