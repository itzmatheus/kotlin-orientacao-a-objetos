class Employer(
    val name: String,
    val cpf: String,
    val salary: Double,
    val type: EmployerType = EmployerType.COMMON,
) {
    fun addBonus(): Double {
        return when(type) {
            EmployerType.COMMON -> salary * 0.1
            EmployerType.MANAGER -> salary * 0.15
            EmployerType.DIRECTOR -> salary * 0.2
        }
    }
}