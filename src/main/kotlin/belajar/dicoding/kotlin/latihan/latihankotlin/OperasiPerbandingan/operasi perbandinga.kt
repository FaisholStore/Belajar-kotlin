package belajar.dicoding.kotlin.latihan.latihankotlin.OperasiPerbandingan

fun main() {
    //operasi bilangan sederhana
    val  angka1 = 10
    val  angka2 = 40
    //kita buat variabel baru

    val  penjum =angka1 +angka2
    println("penjumalahan: $penjum")

    val  pengurangan =angka1 - angka2
    println("pengurangan: $pengurangan")

    val  perkalian =angka1 * angka2
    println("perkalian: $perkalian")

    val  pembagian =angka1 / angka2
    println("pembagian: $pembagian")

    val  sisaBagi =angka1 % angka2
    println("Sisa bagi: $sisaBagi")


//    operasi perbandingan
    val  LebihBesar = angka1 > angka2
    println("lebih besar: $LebihBesar")
    val  LebihKecil = angka1 < angka2
    println("lebih kecil: $LebihKecil")

    val samaDengan = angka1 == angka2
    println("Sama Dengan: $samaDengan")

    val tidakSama = angka1 != angka2
    println("Tidak Sama: $tidakSama")

    val lebihBesarSamaDengan = angka1 >= angka2
    println("Lebih Besar Sama Dengan: $lebihBesarSamaDengan")

    val lebihKecilSamaDengan = angka1 <= angka2
    println("Lebih Kecil Sama Dengan: $lebihKecilSamaDengan")

}