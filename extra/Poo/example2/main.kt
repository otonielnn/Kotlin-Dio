package example2

fun main() {
    val motorPrisma = MotorCombustao()
    val prisma = Carro(motorPrisma)
    prisma.ligar()
    prisma.anda()

    val motorTesla = MotorEletrico()
    val tesla = Carro(motorTesla)
    tesla.ligar()
    tesla.anda()
    tesla.anda()
    tesla.anda()
}