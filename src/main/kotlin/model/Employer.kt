package model

abstract class Employer(
    val name: String,
    val cpf: String,
    val salary: Double,
) {
    abstract val getBonus: Double
}