class Manager(
    val name: String,
    val cpf: String,
    val salary: Double,
    val password: String,
) {
    fun addBonus(): Double {
        return  salary * 0.1
    }

    fun authenticate(): Boolean {
        if (password == "123456") {
            return true
        }
        return false
    }

}