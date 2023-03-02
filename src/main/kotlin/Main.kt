fun main() {

    println("Bem vindo ao Bytebank")

    val titular: String = "Alex"
    val numeroConta: Int = 1123
    var saldo: Double = 0.0

    saldo = 100 + 2.0 - 102.0

    println("titular: $titular")
    println("Número da conta: $numeroConta")
    println("Seu saldo atual: $saldo")

    when {
        saldo > 0.0  -> println("conta é positiva")
        saldo.equals(0.0) -> println("conta zerada")
        else         -> println("conta é negativa")
    }

}