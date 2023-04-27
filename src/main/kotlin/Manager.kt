class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: String,
): Employer(name = name, salary = salary, cpf = cpf) {
    override val getBonus: Double
        get() {
            return salary
        }

    fun authenticate(): Boolean {
        if (password == "123456") {
            return true
        }
        return false
    }

}