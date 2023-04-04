fun main() {

    println("Bem vindo ao ByteBank")

    val johnDoe = Employer("John Doe", "012.345.678-90", 1000.0)

    println("name: ${johnDoe.name}")
    println("cpf: ${johnDoe.cpf}")
    println("salary: ${johnDoe.salary}")
    print("extra: ${johnDoe.addBonus()}")

    val franRegis = Manager("Fran Regis", "000.000.000-00", 1500.0, "123456")

    println("name: ${franRegis.name}")
    println("cpf: ${franRegis.cpf}")
    println("salary: ${franRegis.salary}")
    println("extra: ${franRegis.addBonus()}")

    if (franRegis.authenticate()) {
        println("${franRegis.name} is authenticated!")
    } else {
        println("${franRegis.name} is NOT authenticated!")
    }


}

