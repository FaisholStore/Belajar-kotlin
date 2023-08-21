package belajar.dicoding.kotlin.latihan.latihankotlin.function

fun main() {
    val belanjaan = mapOf(
        "Apel" to 5000,
        "Pisang" to 3000,
        "Jeruk" to 6000,
        "Mangga" to 8000
    )

    val keranjangBelanja = mutableListOf("Apel", "Jeruk", "Mangga")

    val totalHarga = hitungTotalHarga(keranjangBelanja, belanjaan)
    println("Total harga belanja: Rp$totalHarga")

}

fun hitungTotalHarga(keranjang: List<String>, daftarHarga: Map<String, Int>): Int {
    var total = 0
    for (item in keranjang) {
        val hargaItem = daftarHarga[item] ?: 0
        total += hargaItem
    }
    return total
}
