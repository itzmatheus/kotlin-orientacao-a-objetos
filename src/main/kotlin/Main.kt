fun main() {

    println("Bem vindo ao ByteBank")

    val johnDoe = Employer("John Doe", "012.345.678-90", 1000.0)

    println("name: ${johnDoe.name}")
    println("cpf: ${johnDoe.cpf}")
    println("salary: ${johnDoe.salary}")
    println("extra: ${johnDoe.getBonus}")

    println()
    val franRegis = Manager("Fran Regis", "000.000.000-00", 1500.0, "123456")

    println("name: ${franRegis.name}")
    println("cpf: ${franRegis.cpf}")
    println("salary: ${franRegis.salary}")
    println("extra: ${franRegis.getBonus}")

    if (franRegis.authenticate()) {
        println("${franRegis.name} is authenticated!")
    } else {
        println("${franRegis.name} is NOT authenticated!")
    }

    println()
    val joanDoe = Director("Joan Doe", "123.456.543.89", 2000.00, "1234567", 1000.00)
    println("name: ${joanDoe.name}")
    println("cpf: ${joanDoe.cpf}")
    println("salary: ${joanDoe.salary}")
    println("extra: ${joanDoe.getBonus}")
    println("plr: ${joanDoe.plr}")

    if (joanDoe.authenticate()) {
        println("${joanDoe.name} is authenticated!")
    } else {
        println("${joanDoe.name} is NOT authenticated!")
    }

    println()
    val maria = Analyst(name = "maria", cpf = "0123456789", salary = 2000.0)
    println("name: ${maria.name}")
    println("cpf: ${maria.cpf}")
    println("salary: ${maria.salary}")
    println("extra: ${maria.getBonus}")


    val calculatorBonus = CalculatorBonus()
    calculatorBonus.register(johnDoe)
    calculatorBonus.register(franRegis)
    calculatorBonus.register(joanDoe)
    calculatorBonus.register(maria)

    println()
    println("total of bonus: ${calculatorBonus.total}")

}

