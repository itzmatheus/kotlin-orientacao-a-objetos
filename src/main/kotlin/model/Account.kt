package model

abstract class Account(
    private var owner: Owner? = null,
    private val number: Int? = null,
    private var balance: Float = 0.0f,
) {

    abstract fun withdraw(value: Float)

    fun deposit(value: Float) {
        val amount = getBalance() + value
        setBalance(amount)
    }

    fun transfer(accountDestination: Account, amount: Float) {
        withdraw(amount)
        accountDestination.deposit(amount)
    }

    fun getOwner(): Owner? {
        return owner
    }

    protected fun setBalance(value: Float) {
        this.balance = value
    }

    fun getBalance(): Float {
        return balance
    }

}