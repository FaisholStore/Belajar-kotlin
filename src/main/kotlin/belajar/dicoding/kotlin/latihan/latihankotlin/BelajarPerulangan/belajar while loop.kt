package belajar.dicoding.kotlin.latihan.latihankotlin.BelajarPerulangan

fun main() {
//    val nilai = mutableListOf<Int>()
//    var input: Int
//    var totalNilai = 0
//    var jumlahMataKuliah = 0
//
//    println("Masukkan nilai mata kuliah (0 untuk selesai):")
//    while (true) {
//        print("Nilai mata kuliah ke-${jumlahMataKuliah + 1}: ")
//        input = readLine()?.toIntOrNull() ?: 0
//
//        if (input == 0) {
//            break
//        }
//
//        nilai.add(input)
//        totalNilai += input
//        jumlahMataKuliah++
//    }
//
//    if (jumlahMataKuliah > 0) {
//        val rataRata = totalNilai.toDouble() / jumlahMataKuliah
//        println("Jumlah mata kuliah adalah : $jumlahMataKuliah")
//        println("Total nilai: $totalNilai")
//        println("Rata-rata nilai: $rataRata")
//    } else {
//        println("Tidak ada mata kuliah yang diinputkan.")
//    }
        val numbers = listOf(1, 2, 3, 4, 5)

        // Menggunakan lambda dengan nama parameter eksplisit
        val squaredNumbers = numbers.map { number -> number + number }
        println("Squared numbers: $squaredNumbers")

}
