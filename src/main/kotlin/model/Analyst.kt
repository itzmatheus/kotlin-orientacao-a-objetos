package model

class Analyst(
    name: String,
    cpf: String,
    salary: Double,
): Employer(name = name, salary = salary, cpf = cpf) {
    override val getBonus: Double
        get() {
            return salary * 0.1
        }

}
