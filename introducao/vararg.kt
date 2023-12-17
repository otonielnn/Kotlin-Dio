fun main() {

    // vararg(Variable number of arguments) recebe uma quantidade indefinida de parâmetros, desde que respeitem o tipo.
    // O vararg faz o parâmetro virar um array em tempo de execução.
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("Olá", "Hello", "Salut", "Hola", "привет")
    
    fun printAllWithPrefix(vararg messages: String, prefix: String) {  // 3
        for (m in messages) println(prefix + m)
    }
    printAllWithPrefix(
            "Hello", "Hallo", "Salut", "Hola", "你好",
            prefix = "Greeting: "
    )

    fun log(vararg entries: String) {
        // O "*" antes do parâmetro, identifica ele como um vararg
        // sem o "*" ele passaria como um array
        printAll(*entries)
    }
    log("Hello", "Hallo", "Salut", "Hola", "你好")
}