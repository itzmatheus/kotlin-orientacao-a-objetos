class InternalSystem {

    fun login(admin: Authenticable, password: String) {
        if(admin.authenticate(password)) {
            println("authenticated")
        } else {
            println("not authenticated")
        }
    }


}