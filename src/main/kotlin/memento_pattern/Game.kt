package memento_pattern

data class Game( // Originator
    var redTeamScore: Int = 0,
    var blueTeamScore: Int = 0
) {
    fun save(): GameSave = GameSave(this.blueTeamScore, this.redTeamScore)

    fun restore(gameSave: GameSave) {
        this.blueTeamScore = gameSave.blueTeamScore
        this.redTeamScore = gameSave.redTeamScore
    }
}
