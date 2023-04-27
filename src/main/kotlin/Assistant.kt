class Assistant(
    name: String,
    cpf: String,
    salary: Double
): Employer(
    name = name,
    cpf = cpf,
    salary = salary
) {
    override val getBonus: Double
        get() = salary * 0.05
}