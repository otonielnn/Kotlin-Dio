package example1

class Dog  constructor(
    private val owner: Human
){
    var name: String? = null

    fun sayHi() {
        println("Hi my name is $name and my Owner is ${owner.name}")
    }
}