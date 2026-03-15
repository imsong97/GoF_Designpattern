package strategy_pattern

/**
 * Context class
 * */
class Customer(
    private val payment: PayStrategy
) {

    fun order(amount: Int) {
        payment.pay(amount)
    }
}