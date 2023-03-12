fun main() {

    val ownerOne = Owner()
    ownerOne.name = "John Doe"
    val accountOne = Account(ownerOne, 1000, 1000.0f)
    println(accountOne.getOwner()?.name)
    println(accountOne)

    val ownerTwo = Owner()
    ownerTwo.name = "Pathfinder Zemo"
    val accountTwo = Account(ownerTwo, 20000, 1000.0f)
    println(accountTwo.getOwner()?.name)
    println(accountTwo)

    println("TAKE 500 for account one")
    accountOne.withdraw(500f)

    println("DEPOSIT 500 in account two")
    accountTwo.deposit(500f)

    println("accountOne balance ${accountOne.getBalance()}")
    println("accountTwo balance: ${accountTwo.getBalance()}")

    println("GIVE 500  FROM ACCOUNT TWO TO ACCOUNT ONE")
    accountTwo.transfer(accountOne, 500f)

    println("accountOne balance ${accountOne.getBalance()}")
    println("accountTwo balance: ${accountTwo.getBalance()}")


}