fun main() {
    
    // var é uma variável mutável
    var a: String = "Initial"
    println(a)
    a = "Final"
    
    // val é uma variável imutável
    val b: Int = 1 // declarando uma variável imutável e tipando
    val c = 3 // declarando uma variável e deixando seu tipo ser atribuido por inferência
    println(b)
    println(c)
    println(a)
}