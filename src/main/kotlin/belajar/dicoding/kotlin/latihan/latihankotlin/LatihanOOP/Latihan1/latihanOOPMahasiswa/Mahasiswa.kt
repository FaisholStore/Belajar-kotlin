package belajar.dicoding.kotlin.latihan.latihankotlin.LatihanOOP.Latihan1.latihanOOPMahasiswa


class Mahasiswa(val nama: String, val nim: String, var usia: Int) {
    fun info() {
        println("Nama: $nama")
        println("NIM: $nim")
        println("Usia: $usia")
    }

    fun ulangTahun() {
        usia++
        println("$nama berulang tahun! Usia sekarang: $usia")
    }
}
