class LoginActivity {

    companion object {
        var isLogged = 0
    }

    init {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
        println("Login")
    }
    fun login() {
        print("Username : ")
        val inputUsername = readln()
        print("Password : ")
        val inputPass = readln()
        if (inputUsername != UserData.username || inputPass != UserData.password) {
            println("Username atau Password salah!")
            login()
        } else {
            isLogged++
            println("\n<Start Game>\n")
            Thread.sleep(1000L)
        }
    }
}