fun someCondition() = true 

fun main() {

    val d: Int  // Declarando variável imutável
    
    if (someCondition()) {
        d = 1   // inicializando com valor 1.
    } else {
        d = 2   // inicializando com o valor 2.
    }
    
    println(d) // da Output 1 em caso de entrar no bloco if, ou Output 2 em caso de entrar no bloco else.

}