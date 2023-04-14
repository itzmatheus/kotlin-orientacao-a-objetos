fun main() {

    println("Bem vindo ao ByteBank")

    val owner = Owner()
    owner.name = "John Doe"

    val checkingAccount = CheckingAccount(owner = owner, 1001, 1000f)
    val savingAccount = SavingAccount(owner = owner, 1000, 1000f)

    savingAccount.deposit(1000f)
    checkingAccount.deposit(1000f)

    println("total value checking: ${checkingAccount.getBalance()}")
    println("total value saving: ${savingAccount.getBalance()}")

    savingAccount.withdraw(100.0f)
    checkingAccount.withdraw(100.0f)

    println("total value after withdraw checkingAccount: ${checkingAccount.getBalance()}")
    println("total value after withdraw savingAccount: ${savingAccount.getBalance()}")

    checkingAccount.transfer(savingAccount, 100f)

    println("total checkingVault after transfer to savingAccount: ${checkingAccount.getBalance()}")
    println("total savingAccount after receive transfer: ${savingAccount.getBalance()}")


}

