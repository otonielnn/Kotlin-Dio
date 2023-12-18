fun main() {
    cases("Hello") // Output: Greeting
    cases(1)	// Output: One
    cases(0L)	// Output: Long
    cases(MyClass())	// Output: Not a string
    cases("hello")	// Output: Unknown
}

// O when é uma estrutura condicional equivalente ao swtich.
fun cases(obj: Any) {                                
    when (obj) {   
        1 -> println("One")
        "Hello" -> println("Greeting")
        is Long -> println("Long")
        !is String -> println("Not a string")
        else -> println("Unknown")
    }   
}

class MyClass