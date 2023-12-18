fun main() {
    
    // function declaration
    fun maxOld(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

    // function expression
    fun max(a: Int, b: Int) = if (a > b) a else b

    println(max(99, -42))	// Output: 99
    println(maxOld(99, -42))	// Output: 99
}