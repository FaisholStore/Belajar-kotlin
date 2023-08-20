package belajar.dicoding.kotlin.latihan.latihankotlin.belajarboelan

fun main() {
    val nilai = 75

    val kategori = when (nilai) {
        in 85..100 -> "A"
        in 70..84 -> "B"
        in 60..69 -> "C"
        in 50..59 -> "D"
        else -> "E"
    }

    println("Nilai: $nilai")
    println("Kategori Nilai: $kategori")
}
