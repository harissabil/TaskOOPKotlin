class GameActivity {
    init {
        println("==========================")
        println("GAME SUIT TERMINAL VERSION")
        println("==========================")
        println("Welcome ${UserData.username}")
    }
    fun game() {
        print("${UserData.username} Choice : ")
        val inputChoice = readln().lowercase()
        val cpuChoice = Game.pickRandomOption()
        println("CPU Choice : $cpuChoice")
        if (inputChoice != "rock" && inputChoice != "paper" && inputChoice != "scissor") {
            println("Masukkan Choice yang sesuai! rock, paper, atau scissor")
            game()
        } else {
            println("\nResult:")
            when {
                Game.isDraw(inputChoice, cpuChoice) -> println("Draw")
                Game.isWin(inputChoice, cpuChoice) -> println("${UserData.username} Win!")
                else -> println("CPU Win!")
            }
            Thread.sleep(2000L)
            println("\n<Back to Main Menu>\n")
            Thread.sleep(1000L)
        }
    }
}