package memento_pattern

class CareTaker { // CareTaker
    private var save: GameSave? = null

    fun save(gameSave: GameSave) {
        this.save = gameSave
    }

    fun restore() = this.save ?: GameSave()
}