object UserData {
    lateinit var username: String
    lateinit var password: String

    fun isUserInitialized(): Boolean = ::username.isInitialized
    fun isPassInitialized(): Boolean = ::password.isInitialized
}