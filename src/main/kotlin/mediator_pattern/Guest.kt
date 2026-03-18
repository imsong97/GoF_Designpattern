package mediator_pattern

import java.time.LocalDateTime

class Guest {

    private var id: Int = 0
    private val frontDesk = FrontDesk()

    fun getTowers(numberOfTowers: Int) {
        frontDesk.getTowers(this, numberOfTowers)
    }

    internal fun dinner(dateTime: LocalDateTime) {
        frontDesk.dinner(this, dateTime)
    }

    fun getId(): Int = id

    fun setId(id: Int) {
        this.id = id
    }
}