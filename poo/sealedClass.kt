// A sealed class é uma estrutura que criar uma restrição em termo de extensão e visibilidade apenas para classes do mesmo pacote.
sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.name}"
    }
}

fun main() {
    val cat = Cat("garfield")
    val human = Human("Otoniel", "System Developer")
    
    println(greetMammal(cat))
    println(greetMammal(human))
    println(greetMammal(Cat("Snowy")))
}