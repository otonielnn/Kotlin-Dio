fun main() {

    // variáveis do tipo string não podem ser null.
    var neverNull: String = "This can't be null"
    //neverNull = null	// retornar erro "Null can not be a value of a non-null type String"
    
    // a "?" após o tipo faz o kotlin permitir a String ser null.
    var nullable: String? = "You can keep a null here"
    nullable = null
    
    // A inferência entende que o tipo é uma String e não uma String nullable (String?)
    var inferredNonNull = "The compiler assumes non-null"
    //inferredNonNull = null
    
    fun strLength(str: String?): Int {
        return str?.length ?: 0
    }
    
    println(strLength(neverNull)) // Output: 18
    println(strLength(nullable)) // Output: 0
    println(strLength(inferredNonNull)) // Output: 29

}