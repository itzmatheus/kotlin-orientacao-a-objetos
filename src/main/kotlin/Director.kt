class Director(
    name: String,
    cpf: String,
    salary: Double,
    password: String,
    val plr: Double
): EmployerAdmin(name = name, salary = salary, cpf = cpf, password = password) {
    override val getBonus: Double
        get() {
            return salary + plr
        }
}