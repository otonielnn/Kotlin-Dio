package example2;

class Carro constructor(
    private var motor: Motor
){
    var cor: String? = null

    fun ligar() {
        println("Ligando o carro...")
        motor.ligar()
    }

    fun desligar() {
        println("Desligando o carro...")
        motor.desligar()
    }

    fun anda() {
        when {
            !motor.status() -> println("Ligue o carro para poder andar!!!")
            !motor.autonomia() -> {
                when(motor) {
                    is MotorEletrico -> println("Bateria Descarregada!!!")
                    is MotorCombustao -> println("O tank está Vázio!!!")
                }
                desligar()
            }
            else -> {
                motor.gastando()
                when(motor) {
                    is MotorEletrico -> println("O carro está andando")
                    is MotorCombustao -> println("O carro está andando: vruum vruum!")
                }
            }
        }
    }

    fun freia() {
        println("Freiando o carro")
    }

    fun buzina() {
        println("bibi")
    }
}
