fun eatACake() = println("Eat a Cake")
fun bakeACake() = println("Bake a Cake")

fun main() {
    var cakesEaten = 0
    var cakesBaked = 0
    
    // loop while
    while (cakesEaten < 5) {
        eatACake()
        cakesEaten ++
    } //cakesEaten = 5
    
    // loop do-while
    do {
        bakeACake()
        cakesBaked++
    } while (cakesBaked < cakesEaten)
    //cakesBaked = 5
}