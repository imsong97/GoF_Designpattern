package template_method

fun main() {
    val baseTask1: BaseTask = Task1()
    baseTask1.init()

    val baseTask2: BaseTask = Task2()
    baseTask2.init()
}