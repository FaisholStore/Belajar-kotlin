package belajar.dicoding.kotlin.latihan.latihankotlin
fun main() {
    // Memanggil fungsi tanpa parameter
    sayHello()

    // Memanggil fungsi dengan parameter
    printSum(5, 3)

    // Memanggil fungsi dengan parameter dan mengembalikan nilai
    val result = multiply(4, 6)
    println("Result of multiplication: $result")
}

// Fungsi tanpa parameter dan tanpa nilai kembalian
fun sayHello() {
    println("Hello, Kotlin!")
}

// Fungsi dengan parameter
fun printSum(a: Int, b: Int) {
    val sum = a + b
    println("Sum of $a and $b is $sum")
}

// Fungsi dengan parameter dan nilai kembalian
fun multiply(x: Int, y: Int): Int {
    return x * y
}
/*
    Hello, Kotlin!
Sum of 5 and 3 is 8
Result of multiplication: 24
 */