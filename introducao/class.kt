// Declarando a classe Customer
class Customer

// Declarando a classe Contact e seu construtor que receber o id(imutável) e email(mutável)
class Contact(val id: Int, var email: String)

fun main() {

    val customer = Customer()                   // instanciando customer
    
    val contact = Contact(1, "mary@gmail.com")  // instanciando contact

    println(contact.id)	// Output: 1
    println(contact.email) // Output: mary@gmail.com
    contact.email = "jane@gmail.com"	// reatribuindo o valor do email de contact.
    println(contact.email)	// "jane@gmail.com"
}