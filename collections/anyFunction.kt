fun main() {

	// A função any verifica a expressão passada e retorna um boolean.
    val numbers = listOf(1, -2, 3, -4, 5, -6)
    
    val anyNegative = numbers.any { it < 0 }	// verificando se existe algum item menor do que 0.
    
    val anyGT6 = numbers.any { it > 6 }	// verificando se existe algum item maior do que 6.

    println("Numbers: $numbers")
    println("Is there any number less than 0: $anyNegative")
    println("Is there any number greater than 6: $anyGT6")
}