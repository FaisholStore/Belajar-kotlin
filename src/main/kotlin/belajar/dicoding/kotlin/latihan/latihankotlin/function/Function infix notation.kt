package belajar.dicoding.kotlin.latihan.latihankotlin.function

infix fun  String.to(type: String): String {
    if (type == "UP"){
        return this.toUpperCase()
    } else{
        return this.toLowerCase()
    }
}
fun main() {
    val result = "faishol" to  "LO"
    println(result)
}