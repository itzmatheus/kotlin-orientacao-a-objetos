fun main() {

    val ownerOne = Owner()
    ownerOne.name = "John Doe"
    val accountOne = Account(ownerOne, 1000, 1000.0f)
    println(accountOne.owner?.name)
    println(accountOne)

}