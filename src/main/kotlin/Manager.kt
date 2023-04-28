class Manager(
    name: String,
    cpf: String,
    salary: Double,
    password: String,
): EmployerAdmin(name = name, salary = salary, cpf = cpf, password = password) {
    override val getBonus: Double
        get() {
            return salary
        }
}