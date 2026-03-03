package builder_pattern

import java.time.LocalDate

/**
 * 반복되는 builder의 재사용을 위한 클래스
 * */
class TourDirector(
    private val tourPlanBuilder: TourPlanBuilder
) {

    fun cancunTrip(): TourPlan =
        tourPlanBuilder.title("cancunTrip title")
            .nightsAndDays(2, 3)
            .startDate(LocalDate.of(2026, 3,3))
            .whereToStay("whereToStay")
            .addPlan(0, "addPlan 1")
            .addPlan(0, "addPlan 2")
            .getPlan()

    fun longBeachTrip(): TourPlan =
        tourPlanBuilder.title("longBeachTrip title")
            .startDate(LocalDate.of(2021, 7, 15))
            .getPlan()
}