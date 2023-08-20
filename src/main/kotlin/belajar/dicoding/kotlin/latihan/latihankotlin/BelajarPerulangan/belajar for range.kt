package belajar.dicoding.kotlin.latihan.latihankotlin.BelajarPerulangan

fun main() {

//    for (i in 100 downTo 0 step 2){
//        println(i)
//    }

//    val array = arrayListOf("muhammad", "Faishol", "wijanarko")
//    val ukuranArray = array.size - 1
//    for (i in 0..ukuranArray) {
//        println("index $i = ${array[i]}")
//    }
    val array = arrayListOf("muhammad", "Faishol", "wijanarko")
    for (i in 0 until array.size) {
        println("index $i = ${array[i]}")
    }
}