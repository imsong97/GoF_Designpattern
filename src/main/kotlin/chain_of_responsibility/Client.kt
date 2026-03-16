package chain_of_responsibility

fun main() {
    val preStepChain = PreStepA(PreStepB(PreStepC(null)))
    preStepChain.handle()
}