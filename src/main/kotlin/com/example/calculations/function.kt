package com.example.calculations

fun sum() {
    println("Number 1")
    val num1 = Integer.valueOf(readlnOrNull())
    println("Number 2")
    val num2 = Integer.valueOf(readlnOrNull())

    val result = num1 + num2
    println(result)
}

fun main() {
    sum()
}