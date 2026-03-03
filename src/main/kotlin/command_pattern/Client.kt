package command_pattern

fun main() {
    val commandImpl_1 = GameStartCommand(Game())
    val commandImpl_2 = LightOnCommand(Light())
    val commandImpl_3 = LightOffCommand(Light())

    /**
     * 호출부만 바꿔주면 button.press() (invoke)는 바꿀 필요 없음
     * */
//    val button = Button(commandImpl_1)
//    val button = Button(commandImpl_2)
    val button = Button(commandImpl_3)

    button.press()
}