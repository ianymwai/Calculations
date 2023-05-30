package com.example.calculations

data class Student(var name: String, var age: Int = 0, var city: String = "")

fun main() {
    val ian = Student("Ian").apply{
        this.age = 20
        this.city = "Nairobi"
    }
    println("$ian")
}
