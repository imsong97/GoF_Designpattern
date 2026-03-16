package chain_of_responsibility

abstract class PreStepHandler(
    private val nextPreStep: PreStepHandler?
) {
    open fun handle() {
        println("PreStepHandler handle()")
        nextPreStep?.handle()
    }
}