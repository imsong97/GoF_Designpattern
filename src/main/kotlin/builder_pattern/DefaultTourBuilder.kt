package builder_pattern

import java.time.LocalDate

class DefaultTourBuilder : TourPlanBuilder {

    private var title: String? = null
    private var nights: Int = 0
    private var days: Int = 0
    private var startDate: LocalDate? = null
    private var whereToStay: String? = null
    private var plans: MutableList<DetailPlan>? = null

    override fun nightsAndDays(nights: Int, days: Int): TourPlanBuilder =
        this.apply {
            this.nights = nights
            this.days = days
        }

    override fun title(title: String): TourPlanBuilder =
        this.apply {
            this.title = title
        }

    override fun startDate(startDate: LocalDate): TourPlanBuilder =
        this.apply {
            this.startDate = startDate
        }

    override fun whereToStay(whereToStay: String): TourPlanBuilder =
        this.apply {
            this.whereToStay = whereToStay
        }

    override fun addPlan(day: Int, plan: String): TourPlanBuilder =
        this.apply {
            if (plans == null) {
                plans = mutableListOf()
            }
            plans?.add(DetailPlan(day, plan))
        }

    override fun getPlan(): TourPlan {
        return TourPlan(title ?: "", nights, days, startDate, whereToStay ?: "", plans ?: mutableListOf())
    }
}