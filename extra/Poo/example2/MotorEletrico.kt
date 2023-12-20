package example2

class MotorEletrico: Motor() {
    private var nivelBateria: Int = 1

    override fun autonomia(): Boolean {
        return nivelBateria > 0
    }

    override fun gastando() {
        println("Gastando energia, nivel agora é: $nivelBateria")
        nivelBateria--
    }
}