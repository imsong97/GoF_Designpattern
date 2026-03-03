package command_pattern

class Button(
    private val commandImpl: Command
) {
    fun press() {
        commandImpl.execute()
    }
}