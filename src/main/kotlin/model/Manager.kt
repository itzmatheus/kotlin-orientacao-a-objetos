package model

class Manager(
    name: String,
    cpf: String,
    salary: Double,
    password: String,
): EmployerAdmin(name = name, salary = salary, cpf = cpf, password = password), Authenticable {
    override val getBonus: Double
        get() {
            return salary
        }

    override fun authenticate(password: String): Boolean {
        return super<Authenticable>.authenticate(password)
    }
}