abstract class Employer(
    val name: String,
    val cpf: String,
    val salary: Double,
) {
    open val getBonus: Double get() = salary * 0.1
}