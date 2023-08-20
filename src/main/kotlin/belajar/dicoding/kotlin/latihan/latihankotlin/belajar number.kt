package belajar.dicoding.kotlin.latihan.latihankotlin

//Menghitung Rata-rata Nilai Mahasiswa
fun main() {
    val nilaiMahasiswa = arrayOf(80, 90, 70, 85, 65, 95)
    val jumlahNilai = nilaiMahasiswa.size
    var totalNilai = 0

    for (nilai in nilaiMahasiswa) {
        totalNilai += nilai
    }

    val rataRata = totalNilai / jumlahNilai

    println("Rata-rata nilai mahasiswa: $rataRata")
}
