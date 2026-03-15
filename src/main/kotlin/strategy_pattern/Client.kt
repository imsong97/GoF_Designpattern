package strategy_pattern

fun main() {
    /**
     * client에서 직접 선택
     * */
//    val pay: PayStrategy = KakaoPay()
    val pay: PayStrategy = NaverPay()

    val customer = Customer(pay)
    customer.order(10000)
}