package command_pattern

class GameStartCommand(
    private val game: Game
) : Command {

    override fun execute() {
        game.start()
    }
}