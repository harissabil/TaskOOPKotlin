import kotlin.random.Random

object Game {

    private val rules = mapOf(
        "rock-scissor" to true,
        "rock-paper" to false,
        "scissor-paper" to true,
        "scissor-rock" to false,
        "paper-rock" to true,
        "paper-scissor" to false
    )

    private val option = listOf("rock", "paper", "scissor")

    fun pickRandomOption(): String = option[Random.nextInt(0, 3)]

    fun isDraw(from: String, to: String): Boolean = from == to

    fun isWin(from: String, to: String): Boolean = rules["$from-$to"]!!
}