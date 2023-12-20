package example2

abstract class Motor {
    private var ligado: Boolean = false

    fun ligar() {
        ligado = true
    }

    fun desligar() {
        ligado = false
    }

    fun status(): Boolean {
        return ligado
    }

    abstract fun autonomia(): Boolean

    abstract fun gastando()
}