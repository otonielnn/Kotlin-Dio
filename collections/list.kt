val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3)        // lista mutável (pode ser alterada)
val sudoers: List<Int> = systemUsers                              // copia da lista mutável (apenas visualização)

// função para adicionar novo usuário
fun addSystemUser(newUser: Int) {
    systemUsers.add(newUser)                      
}

// retorna a copia da lista
fun getSysSudoers(): List<Int> {
    return sudoers
}

fun main() {
    addSystemUser(4)	// adiciona um novo usuário no sistema
    println("Tot sudoers: ${getSysSudoers().size}")	// retorna o tamanho da copia da lista
    getSysSudoers().forEach {
        i -> println("Some useful info on user $i")
    }
    // getSysSudoers().add(5) <- Error!
}