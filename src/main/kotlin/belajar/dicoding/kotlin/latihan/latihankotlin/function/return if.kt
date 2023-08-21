package belajar.dicoding.kotlin.latihan.latihankotlin.function

fun main() {


    fun pembalikanIF(name: String = ""): String {
    return when (name){
        "" -> "hello world"
        else ->  "hello $name"
    }
 }
    val result = pembalikanIF("faishol")
    println(result) // Cetak hasil dari pemanggilan fungsi ke konsol
 }