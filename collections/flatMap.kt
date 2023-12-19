fun main() {

    val fruitsBag = listOf("apple","orange","banana","grapes")  // 1
    val clothesBag = listOf("shirts","pants","jeans")           // 2
    val cart = listOf(fruitsBag, clothesBag)	
    val mapBag = cart.map { it }	// mantém as 2 listas separadas.
    val flatMapBag = cart.flatMap { it }	// unifica os elementos de fruitsBag e clothesBag em uma única lista.

    println("Your bags are: $mapBag")
    println("The things you bought are: $flatMapBag")
}