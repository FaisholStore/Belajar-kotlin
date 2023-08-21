@file:Suppress("NAME_SHADOWING")

package belajar.dicoding.kotlin.latihan.latihankotlin.belajarbreakContinue

fun main() {
    var i = 0
    println("hello world ke $i")
    for (i in 1..10) {
        if (i == 9) {
            println("Loop dihentikan pada i = $i")
            break // Keluar dari loop saat i mencapai 5
        }
        println("Iterasi ke-$i")
    }
    println("Loop selesai")
    var ii = 0
    while (ii < 10) {
        if (ii == 3 || i == 7) {
            ii++
            continue // Lewati iterasi saat i adalah 3 atau 7
        }
        println("Hello ke $ii")
        ii++
    }

}
