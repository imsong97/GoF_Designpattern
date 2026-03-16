package chain_of_responsibility

class PreStepC(
    private val nextPreStep: PreStepHandler?
) : PreStepHandler(nextPreStep) {
    override fun handle() {
        println("PreStepC")
        super.handle()
    }
}