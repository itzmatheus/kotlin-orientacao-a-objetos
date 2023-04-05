class Director(
    name: String,
    cpf: String,
    salary: Double,
    val password: String,
    val plr: Double
): Employer(name = name, salary = salary, cpf = cpf) {
    override val getBonus: Double
        get() {
            return super.getBonus + salary + plr
        }

    fun authenticate(): Boolean {
        if (password == "1234567") {
            return true
        }
        return false
    }

}