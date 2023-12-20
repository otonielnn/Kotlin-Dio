package example1

fun main() {
    var otoniel = Human()
    otoniel.name = "Otoniel Júnior"
    val dog = Dog(otoniel)
    dog.name = "Tux"

    var lucas = Human()
    lucas.name = "Lucas Montano"
    val dogSara = Dog(lucas)
    dogSara.name = "Android"

    dog.sayHi()
    dogSara.sayHi()
}
