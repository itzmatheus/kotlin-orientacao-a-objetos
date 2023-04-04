fun main() {

    println("Bem vindo ao ByteBank")

    val johnDoe = Employer("John Doe", "012.345.678-90", 1000.0, EmployerType.COMMON)

    println("name: ${johnDoe.name}")
    println("cpf: ${johnDoe.cpf}")
    println("salary: ${johnDoe.salary}")
    print("extra: ${johnDoe.addBonus()}")

}

