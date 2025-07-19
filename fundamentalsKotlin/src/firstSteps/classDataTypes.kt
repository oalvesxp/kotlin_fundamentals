package firstSteps

fun main() {
    val age: Int = 20

    var ageDouble: Double = age.toDouble()
    val monthPercentage: Double = 1.0 / 12.0

    println("age is $ageDouble")
    println("month percentage is $monthPercentage")

    // 9 months later
    var months: Int = 9
    var monthsCount: Int = 9
    ageDouble += months * monthPercentage

    println("age after 7 months is $ageDouble")

    // 3 months later
    months = 3
    monthsCount += months
    ageDouble += months * monthPercentage
    println("age after 12 months is $ageDouble")

    // print formated text:
    // age as string
    // formated: "Your age after X months is X years."
    val formatedText: String = "Your age after $monthsCount months is ${ageDouble.toString().plus(" years")}"
    println(formatedText)
}