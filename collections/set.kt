// OBS: diferente da list, o set não recebe itens duplicados.
val openIssues: MutableSet<String> = mutableSetOf("uniqueDescr1", "uniqueDescr2", "uniqueDescr3") // set mutável

// Adiciona novo item
fun addIssue(uniqueDesc: String): Boolean {                                                       
    return openIssues.add(uniqueDesc)
}

// retorna mensagem informando se o item foi adiciona ou não
fun getStatusLog(isAdded: Boolean): String {                                                       
    return if (isAdded) "registered correctly." else "marked as duplicate and rejected."
}

fun main() {
    val aNewIssue: String = "uniqueDescr4"
    val anIssueAlreadyIn: String = "uniqueDescr2" 

    println("Issue $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("Issue $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}