class SavingAccount(
    owner: Owner,
    number: Int?,
    balance: Float
): Account(
    owner = owner,
    number = number,
    balance = balance
) {
    override fun withdraw(value: Float) {
        if (this.getBalance() >= value) {
            this.setBalance(this.getBalance() - value)
        }
    }
}