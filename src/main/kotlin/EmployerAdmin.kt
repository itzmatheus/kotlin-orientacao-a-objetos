abstract class EmployerAdmin(
    name: String,
    cpf: String,
    salary: Double,
    val password: String,
): Employer(name = name, cpf = cpf, salary = salary), Authenticable {

    override fun authenticate(password: String): Boolean = this.password == password

}