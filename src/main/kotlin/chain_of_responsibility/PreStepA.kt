package chain_of_responsibility

class PreStepA(
    private val nextPreStep: PreStepHandler?
) : PreStepHandler(nextPreStep) {
    override fun handle() {
        println("PreStepA")
        super.handle()
    }
}