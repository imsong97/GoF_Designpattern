package mediator_pattern

fun main() {
    val guest = Guest()
    guest.getTowers(3) // guest request towers -> front desk(mediator) -> cleaning service
}