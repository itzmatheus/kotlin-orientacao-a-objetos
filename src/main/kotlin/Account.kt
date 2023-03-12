import java.lang.Exception

data class Account(
    private var owner: Owner? = null,
    private val number: Int? = null,
    private var balance: Float = 0.0f,
) {

    fun withdraw(value: Float) {
        if (!isAmountAvailableToTake(value)) {
            throw Exception("DENIED! You just have ${getBalance()} of balance.")
        }
        val amount = getBalance() - value
        setBalance(amount)
    }

    fun deposit(value: Float) {
        val amount = getBalance() + value
        setBalance(amount)
    }

    fun transfer(accountDestination: Account, amount: Float) {
        withdraw(amount)
        accountDestination.deposit(amount)
    }

    private fun isAmountAvailableToTake(
        amountRequired: Float
    ) = amountRequired <= getBalance()

    fun getOwner(): Owner? {
        return owner
    }

    private fun setBalance(value: Float) {
        this.balance = value
    }

    fun getBalance(): Float {
        return balance
    }

}