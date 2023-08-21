package belajar.dicoding.kotlin.latihan.latihankotlin.function

fun displayInfo(firstName: String, age: Int) {
    println("Name: $firstName")
    println("Age: $age")
}

fun main() {
    val name = "Bob"
    val userAge = 30
    displayInfo(name, userAge)
}
/*Dalam contoh ini, kita memiliki fungsi displayInfo yang mencetak informasi nama dan usia.
 Fungsi ini juga merupakan Unit Returning Function karena tidak mengembalikan nilai yang dapat digunakan dalam ekspresi lain.

Ketika main dieksekusi,
kita memanggil displayInfo dengan memberikan nama dan usia sebagai argumen.
 Fungsi tersebut hanya mencetak
 informasi tersebut di layar tanpa menghasilkan nilai balik yang dapat ditangkap oleh variabel atau ekspresi lain.




*/