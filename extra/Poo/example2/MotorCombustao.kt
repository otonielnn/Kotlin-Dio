package example2

class MotorCombustao: Motor() {
    private var nivelCombustivel: Int = 2

    override fun autonomia(): Boolean {
        return nivelCombustivel > 0
    }

    override fun gastando() {
        println("Gastando combustivel, nivel agora é: $nivelCombustivel")
        nivelCombustivel--
    }
}