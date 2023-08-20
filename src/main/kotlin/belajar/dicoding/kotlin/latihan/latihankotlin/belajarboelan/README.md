# Penjelasan Kode Kotlin

Berikut adalah penjelasan langkah demi langkah mengenai kode Kotlin yang Anda berikan.

```kotlin
package belajar.dicoding.kotlin.latihan.latihankotlin.belajarif.`else`

fun main() {
    // Mendefinisikan nilai-nilai ujian
    val nilai1 = 100
    val nilai2 = 20
    val nilai3 = 90
    val nilai4 = 100

    // Menghitung nilai rata-rata
    val nilaiRataRata = (nilai1 + nilai2 + nilai3 + nilai4) / 4

    // Menentukan status kelulusan
    val statusLulus = when {
        nilaiRataRata >= 70 -> "Lulus"
        else -> "Tidak lulus"
    }

    // Menentukan kategori nilai
    val kategori = when (nilaiRataRata) {
        in 85..100 -> "A"
        in 70..84 -> "B"
        in 60..69 -> "C"
        in 50..59 -> "D"
        else -> "E"
    }

    // Menampilkan hasil
    println("Nilai Ujian 1: $nilai1")
    println("Nilai Ujian 2: $nilai2")
    println("Nilai Ujian 3: $nilai3")
    println("Nilai Ujian 4: $nilai4")
    println("Nilai Rata-rata: $nilaiRataRata")
    println("Status Kelulusan: $statusLulus")
    println("Kategori Nilai: $kategori")
}
