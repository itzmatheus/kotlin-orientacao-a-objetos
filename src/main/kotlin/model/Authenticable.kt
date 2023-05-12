package model

interface Authenticable {
    val password: String
    fun authenticate(password: String): Boolean = this.password == password
}