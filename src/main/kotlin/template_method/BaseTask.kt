package template_method

abstract class BaseTask {

    abstract fun doTask()

    fun init() {
        before()

        doTask()
    }

    private fun before() {
        println("do before")
    }
}