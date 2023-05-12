package test

import model.Analyst
import model.CalculatorBonus
import model.Director
import model.Manager

fun testEmployers() {
    println()
    val franRegis = Manager("Fran Regis", "000.000.000-00", 1500.0, "123456")

    println("name: ${franRegis.name}")
    println("cpf: ${franRegis.cpf}")
    println("salary: ${franRegis.salary}")
    println("extra: ${franRegis.getBonus}")

    if (franRegis.authenticate("123456")) {
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

    if (joanDoe.authenticate("123456")) {
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
    calculatorBonus.register(franRegis)
    calculatorBonus.register(joanDoe)
    calculatorBonus.register(maria)

    println()
    println("total of bonus: ${calculatorBonus.total}")
}
