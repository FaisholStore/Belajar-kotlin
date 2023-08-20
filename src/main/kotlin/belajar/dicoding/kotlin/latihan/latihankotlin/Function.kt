package belajar.dicoding.kotlin.latihan.latihankotlin

fun main() {
    val user = getUser("Alfian", 19)
    println(user)

    printUser("Alfian")
}

fun getUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}

/*
output :
Your name is Alfian, and you 19 years old
Your name is Alfian
*/