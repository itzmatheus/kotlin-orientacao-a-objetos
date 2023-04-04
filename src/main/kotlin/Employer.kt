class Employer(
    val name: String,
    val cpf: String,
    val salary: Double,
) {
    fun addBonus(): Double {
        return  salary * 0.1
    }
}