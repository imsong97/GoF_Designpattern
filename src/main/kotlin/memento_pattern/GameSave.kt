package memento_pattern

data class GameSave( // Memento(immutable)
    val blueTeamScore: Int = 0,
    val redTeamScore: Int = 0
)
