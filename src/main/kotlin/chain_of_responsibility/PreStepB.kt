package chain_of_responsibility

class PreStepB(
    private val nextPreStep: PreStepHandler?
) : PreStepHandler(nextPreStep) {
    override fun handle() {
        println("PreStepB")
        super.handle()
    }
}