package belajar.dicoding.kotlin.latihan.latihankotlin.function

fun main() {
    val BelanjaHarian = mapOf(
        "handphone" to 5000,
         "laptop" to 25000,
        "keyboard" to 15000,
    )
    val KeranjangBelanja = mutableListOf("handphone", "laptop", "keyboard")
    val  totalHarga = HitungTotalHarga(KeranjangBelanja, BelanjaHarian)
    println("totalharga: $totalHarga")
    tampilkanDetailBelanja (KeranjangBelanja,BelanjaHarian)
}
fun HitungTotalHarga(Keranjang: List<String>, daftarHarga: Map<String, Int>): Int {
    var total = 0
    for (item in Keranjang) {
        val hargaItem = daftarHarga[item] ?: 0
        total += hargaItem
    }
    return total
}

fun tampilkanDetailBelanja(keranjang: List<String>, daftarHarga: Map<String, Int>) {
    println("Detail belanja:")
    for (item in keranjang) {
        val hargaItem = daftarHarga[item] ?: 0
        println("$item - Rp$hargaItem")
    }
}