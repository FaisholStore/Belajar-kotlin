package belajar.dicoding.kotlin.latihan.latihankotlin.LatihanOOP.Latihan1

import belajar.dicoding.kotlin.latihan.latihankotlin.LatihanOOP.Latihan1.latihanOOPMahasiswa.Mahasiswa

fun main() {
    val mahasiswa1 = Mahasiswa("John Doe", "123456", 20)
    val mahasiswa2 = Mahasiswa("Jane Smith", "654321", 22)

    mahasiswa1.info()
    mahasiswa1.ulangTahun()
    mahasiswa1.info()

    mahasiswa2.info()
    mahasiswa2.ulangTahun()
    mahasiswa2.info()
}
