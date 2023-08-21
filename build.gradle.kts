plugins {
    kotlin("jvm") version "1.9.0"
    application
}

group = "com.dicoding.kotlin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}
tasks.register("author"){
    val author: String by  project
    val email: String by project
    doLast {
        println("Author: ${author}:${email}")
    }
}
tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}