import java.lang.Exception

data class Account(
    var owner: Owner? = null,
    val number: Int? = null,
    var balance: Float = 0.0f,
) {

    fun withdraw(amount: Float) {

        if (!isAmountAvailableToTake(amount)) {
            throw Exception("DENIED! You just have ${this.balance} of balance.")
        }

        this.balance -= amount
    }

    fun deposit(amount: Float) {
        this.balance += amount
    }

    fun transfer(accountDestination: Account, amount: Float) {
        withdraw(amount)
        accountDestination.deposit(amount)
    }

    private fun isAmountAvailableToTake(
        amountRequired: Float
    ) = amountRequired <= this.balance

}