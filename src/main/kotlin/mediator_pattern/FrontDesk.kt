package mediator_pattern

import java.time.LocalDateTime

/**
 * Mediator class
 * */
class FrontDesk {

    private val cleaningService = CleaningService()
    private val restaurant = Restaurant()

    fun getTowers(guest: Guest, numberOfTowers: Int) {
        cleaningService.getTowers(guest.getId(), numberOfTowers)
    }

    fun getRoomNumberFor(guestId: Int?): String = "1111"

    fun dinner(guest: Guest, dateTime: LocalDateTime) {
        restaurant.dinner(guest.getId(), dateTime)
    }
}