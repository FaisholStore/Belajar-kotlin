package belajar.dicoding.kotlin.latihan.latihankotlin.belajarif.`else`

fun main() {
    val openHours = 7
    val now = 20
    val office :String
    if (now < openHours){
        office ="office already open"
    }else{
        office = "tutup gan"
    }
println(office)
}
