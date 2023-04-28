fun testLogin() {
    println("Bem vindo ao ByteBank")
    val manager = Manager(name = "fulano", cpf = "00000", salary = 1000.0, password = "1234565")

    val director = Director(name = "sicrano", cpf = "11111", salary = 1000.0, password = "1234565", plr = 200.0)

    val system = InternalSystem()
    system.login(manager, "1234565")
    system.login(director, "1234567")
}