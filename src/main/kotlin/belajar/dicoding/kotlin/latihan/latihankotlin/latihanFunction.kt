package belajar.dicoding.kotlin.latihan.latihankotlin

fun main() {
    val nama = iniNama("muhammad faishol",20)

    println(nama)

    printNama("muhammad faishol")
}

fun iniNama(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printNama(name: String) {
    println("Your name is $name")
}

/*
Your name is muhammad faishol, and you 20 years old
Your name is muhammad faishol

 */