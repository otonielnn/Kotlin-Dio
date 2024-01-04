fun main() {
    val a = 10
    val b = 0
    
    try {
        val divisao = a / b
    } catch(e: ArithmeticException) {
        println("ERRO, você tentou dividir por 0")
    } catch(e: Throwable) {
        println(e.message);
    } finally {
        println("Finally")
    }
}