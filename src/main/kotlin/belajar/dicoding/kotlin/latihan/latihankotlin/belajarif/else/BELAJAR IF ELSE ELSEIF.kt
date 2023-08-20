package belajar.dicoding.kotlin.latihan.latihankotlin.belajarif.`else`

fun main() {
    val score = 99

    val grade = if (score <= 100 &&score >= 90) {
        "A"
    } else if (score < 90 && score >= 80) {
        "B"
    } else if (score < 80 && score >= 70) {
        "C"
    } else if (score < 70 && score >= 60) {
        "D"
    } else {
        "F"
    }

    val feedback = when (grade) {
        "A" -> "Excellent job!"
        "B" -> "Good work!"
        "C" -> "You did alright."
        "D" -> "You passed, but there's room for improvement."
        else -> "You need to study harder."
    }

    println("Your grade is $grade")
    println(feedback)
}
