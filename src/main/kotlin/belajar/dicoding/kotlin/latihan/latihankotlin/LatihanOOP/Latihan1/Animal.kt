package belajar.dicoding.kotlin.latihan.latihankotlin.LatihanOOP.Latihan1

class Animal(val name: String, val species: String, val age: Int) {
    fun makeSound() {
        println("$name makes a sound.")
    }

    fun introduce() {
        println("Hi, I'm $name, a $species, and I'm $age years old.")
    }
}

fun main() {
    val myAnimal = Animal("Leo", "Lion", 5)

    myAnimal.makeSound()
    myAnimal.introduce()
}
