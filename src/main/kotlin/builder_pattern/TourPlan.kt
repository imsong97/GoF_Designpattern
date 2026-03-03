package builder_pattern

import java.time.LocalDate

data class TourPlan(
    var title: String = "",
    var nights: Int = 0,
    var days: Int = 0,
    var startDate: LocalDate? = null,
    var whereToStay: String = "",
    var plans: MutableList<DetailPlan> = mutableListOf()
) {
    constructor(
        title: String,
        startDate: LocalDate?,
        whereToStay: String,
        plans: MutableList<DetailPlan>
    ) : this(title, 0, 0, startDate, whereToStay, plans)

    fun addPlan(day: Int, plan: String) {
        plans.add(DetailPlan(day, plan))
    }
}