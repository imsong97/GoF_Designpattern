package builder_pattern

fun main() {
    val director: TourDirector = TourDirector(DefaultTourBuilder())
    val tourPlan = director.cancunTrip()
    val tourPlan1 = director.longBeachTrip()
}