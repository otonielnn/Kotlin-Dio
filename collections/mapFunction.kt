fun main() {

    // A map function server para transformar itens de uma lista.
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    
    val doubled = numbers.map { x -> x * 2 }	// multiplica todos itens por 2.
    
    val tripled = numbers.map { it * 3 }	// multiplica todos itens por 3.


    println("Numbers: $numbers")
    println("Doubled Numbers: $doubled")
    println("Tripled Numbers: $tripled")
}