// O open permite que a classa seja herdada por outra.
open class Dog {
    // este metodo também está sendo hardado, podendo ser sobrescrito.
    open fun sayHello() {
        println("wow wow!")
    }
}

// classe herdada da classe Dog
class Yorkshire : Dog() {
    // sobrescrevendo o metodo sayhello.
    override fun sayHello() {
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}