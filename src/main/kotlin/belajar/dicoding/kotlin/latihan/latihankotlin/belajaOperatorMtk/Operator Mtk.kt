package belajar.dicoding.kotlin.latihan.latihankotlin.belajaOperatorMtk

fun main() {
    val nilai = 10 / 3 ;
    println(nilai)

    val  nilai2 = 10 + 10 +10 *8
    println(nilai2)

    var hargaBarang1 = 100000
    var hargaBarang2 = 200000
    var hargaBarang3 = 300000

    //menggunakna perintah assignments

    var totalBelanja = 0
    totalBelanja += hargaBarang1
    totalBelanja += hargaBarang2
    totalBelanja += hargaBarang3

    //kita print hasil dari total belanja

    println("Harga dari barang 1: Rp $hargaBarang1")
    println("Harga dari barang 1: Rp $hargaBarang2")
    println("Harga dari barang 1: Rp $hargaBarang3")
    println("total belanja hari ni adalah: Rp $totalBelanja")
}
