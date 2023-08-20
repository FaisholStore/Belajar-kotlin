package belajar.dicoding.kotlin.latihan.latihankotlin.belajarboelan

fun main() {
    val hasActiveMembership = true

    val canAccessContent = !hasActiveMembership

    if (canAccessContent) {
        println("Anda memiliki akses ke konten premium.")
    } else {
        println("Anda belum memiliki akses ke konten premium.")
    }
}
