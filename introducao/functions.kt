fun printMessage(message: String): Unit {                               // Função que da Output da String passada como  parâmetro. O tipo de retorno "Unit" se assemelha ao "Void " do java.
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {  // Exemplo de parâmetro com valor Padrão.
    println("[$prefix] $message") // Exemplo de Interpolação
}

fun sum(x: Int, y: Int): Int {                                          // Função para somar 2 números inteiros, que retorna um valor inteiro.
    return x + y
}

fun multiply(x: Int, y: Int) = x * y                                    // Exemplo de inline Function

fun main() {
    printMessage("Hello")                                               // Output: Hello
    printMessageWithPrefix("Otoniel", "Name")                           // Output: [Name] Otoniel
    printMessageWithPrefix("Otoniel")                                   // Output: [Info] Otoniel
    printMessageWithPrefix(prefix = "Kotlin", message = "Hi")           // Output: [Kotlin] Hi
    println(sum(1, 2))                                                  // Output: 3
    println(multiply(2, 4))                                             // Output: 8
}