package belajar.dicoding.kotlin.latihan.latihankotlin.belajaOperatorMtk

fun main() {
    val  dataBarang = listOf(
        "buku tulis" to 50000,
        "pulpen" to  4000,
        "penggaris" to 60000
    )

    var totalBelanja =0
     println("daftar Harga")
    for ((
    barang, harga
            )in dataBarang){
        println("$barang: Rp $harga")
        totalBelanja += harga

    }
    println("total harga nya yaitu: Rp $totalBelanja")

    var  angka = 1
    while (angka <= 60)
    println(++angka)
    println(--angka)

//untuk boelan kebalik
    val suhu =-5
    println(suhu)
    val  sehat =true
    println(!sehat)
}