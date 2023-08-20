package belajar.dicoding.kotlin.latihan.latihankotlin.BelajarPerulangan

fun main() {

    var array = arrayListOf(
        Triple("Muhammad", "10 Mei 1990", 31),
        Triple("Faishol", "15 Juli 1995", 28),
        Triple("Wijanarko", "20 September 1988", 33)
    )

    for (person in array) {
        val (name, birthdate, age) = person
        println("Nama: $name, Tanggal Lahir: $birthdate, Umur: $age tahun")
    }
}
