class MainActivity : Activity() {

    init {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
    }
    override fun action(): Int {
        println("1. Registration")
        println("2. Login")
        println("3. Play game")
        return when (readln().toInt()) {
            1 -> 1
            2 -> 2
            3 -> 3
            else -> 0
        }
    }
}