class IllegalVoterException(message: String) : Throwable(message)

@Throws(IllegalArgumentException:: class)
fun vote(name: String, age: Int) {
    if (age < 16) {
        throw IllegalVoterException("$name não pode votar")
    }
    println("Voto por $name de $age anos de idade foi realizado com sucesso!")
}

fun main() {
    var quantidadeVotos = 0;
    quantidadeVotos += try {
     vote("Otoniel", 21)
     1
    } catch (e : IllegalVoterException) { 0 }
	quantidadeVotos += try {
        vote("Klebinho", 10)
        1
    } catch (e : IllegalVoterException) { 0 }
    quantidadeVotos += try {
        vote("Maria", 55)
        1
    } catch (e : IllegalVoterException) { 0 }
    println(quantidadeVotos)
}