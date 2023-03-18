fun main() {
    val mainActivity = MainActivity()
    when (mainActivity.action()) {
        1 -> {
            val registerActivity = RegisterActivity()
            registerActivity.registration()
            main()
        }
        2 -> {
            val loginActivity = LoginActivity()
            loginActivity.login()
            val gameActivity = GameActivity()
            gameActivity.game()
            main()
        }
        3 -> {
            if (!UserData.isUserInitialized() && !UserData.isPassInitialized()) {
                println("Silahkan registrasi terlebih dahulu!")
                Thread.sleep(1500L)
                main()
            } else if (LoginActivity.isLogged == 0) {
                println("Silahkan login terlebih dahulu")
                Thread.sleep(1500L)
                main()
            }
            val gameActivity = GameActivity()
            gameActivity.game()
            main()
        }
        else -> {
            val retryMessage = "Masukkan angka yang sesuai!"
            println(retryMessage)
            main()
        }
    }
}