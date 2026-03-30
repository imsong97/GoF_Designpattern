package memento_pattern

fun main() {
    val game = Game()
    val careTaker = CareTaker()

    game.blueTeamScore = 10
    game.redTeamScore = 20

    careTaker.save(game.save())

    game.blueTeamScore = 11
    game.redTeamScore = 21

    game.restore(careTaker.restore())

    println(game.blueTeamScore)
    println(game.redTeamScore)
}