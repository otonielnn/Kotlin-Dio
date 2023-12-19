fun main() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    
    val positives = numbers.filter { x -> x > 0 }
    
    val negatives = numbers.filter { it < 0 }


    println("Numbers: $numbers") // [1, -2, 3, -4, 5, -6]
    println("Positive Numbers: $positives") // [1, 3, 5]
    println("Negative Numbers: $negatives")	// [-2, -4, -6]
}