class InternalSystem {

    fun login(admin: EmployerAdmin, password: String) {
        if(admin.authenticate(password)) {
            println("authenticated")
        } else {
            println("not authenticated")
        }
    }


}