package model

class Client(
    val name: String,
    val cpf: String,
    override val password: String,
) : Authenticable