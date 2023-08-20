package belajar.dicoding.kotlin.latihan.latihankotlin.belajarboelan

fun main() {
    val value: Any = "hallo semua"

    val teks = when (value) {
        is Int -> "Ini adalah angka"
        is String -> "Ini adalah string"
        is Double -> "Ini adalah bilangan desimal"
        else -> "Tipe data tidak dikenali"
    }

    println(teks)
}
