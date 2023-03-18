class RegisterActivity {

    init {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
        println("Registration")
    }

    fun registration() {
        print("Input Username : ")
        val inputUsername = readln()
        print("Input Password : ")
        val inputPass = readln()
        print("Re-input Password : ")
        val reinputPass = readln()
        if (inputPass != reinputPass) {
            println("Password yang diinput harus sama!")
            registration()
        } else {
            UserData.username = inputUsername
            UserData.password = inputPass
            println("\nRegistration Success!")
            Thread.sleep(1000L)
            println("<Back to main menu>\n")
            Thread.sleep(1500L)
        }
    }
}