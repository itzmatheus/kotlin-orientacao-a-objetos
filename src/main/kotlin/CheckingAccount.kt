class CheckingAccount(
    owner: Owner,
    number: Int?,
    balance: Float
): Account(
    owner = owner,
    number = number,
    balance = balance
) {
    override fun withdraw(value: Float) {
        val valueWithTax: Float = value + 0.1f
        super.withdraw(valueWithTax)
    }
}