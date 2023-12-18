fun main() {
    println(whenAssign("Hello"))	// Output: 1
    println(whenAssign(3.4))	// Output: 42
    println(whenAssign(1))	// Output: one
    println(whenAssign(MyClass()))	// Output: 42
}

fun whenAssign(obj: Any): Any {
    val result = when (obj) {
        1 -> "one"
        "Hello" -> 1
        is Long -> false
        else -> 42
    }
    return result
}

class MyClass