package model

class Director(
    name: String,
    cpf: String,
    salary: Double,
    password: String,
    val plr: Double
): EmployerAdmin(
    name = name,
    salary = salary,
    cpf = cpf,
    password = password
), Authenticable {
    override val getBonus: Double
        get() {
            return salary + plr
        }

    override fun authenticate(password: String): Boolean {
        return super<EmployerAdmin>.authenticate(password)
    }
}