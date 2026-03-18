package mediator_pattern

class CleaningService {

    private val frontDesk = FrontDesk()

    fun getTowers(guestId: Int, numberOfTowers: Int) {
        val roomNumber = frontDesk.getRoomNumberFor(guestId)
        println("provide $numberOfTowers to $roomNumber")
    }
}