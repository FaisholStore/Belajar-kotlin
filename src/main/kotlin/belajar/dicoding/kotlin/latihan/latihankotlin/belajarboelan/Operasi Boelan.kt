package belajar.dicoding.kotlin.latihan.latihankotlin.belajarboelan

fun main() {

    val nilaiTugas = 80
    val nilaiUjian = 75

    val lulusTugas = nilaiTugas >= 70
    val lulusUjian = nilaiUjian >= 70

    val lulusSemua = lulusTugas && lulusUjian
    val lulusSalahSatu = lulusTugas || lulusUjian
    val tidakLulusSemua = !lulusSemua

    println("Nilai Tugas: $nilaiTugas")
    println("Nilai Ujian: $nilaiUjian")

    println("Status Lulus Semua: $lulusSemua")
    println("Status Lulus Salah Satu: $lulusSalahSatu")
    println("Status Tidak Lulus Semua: $tidakLulusSemua")
}