package belajar.dicoding.kotlin.latihan.latihankotlin.function

fun calculateSum(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val num1 = 5
    val num2 = 3
    val sum = calculateSum(num1, num2)
    println("Sum of $num1 and $num2 is: $sum" )
}
