package com.example.calculations

import java.util.Scanner

fun main() {

    println("Enter a number")
    var num = Integer.valueOf(readlnOrNull())
    println("Enter your name")
    var read = readlnOrNull()

    when (num) {
        in 1..5 -> println("Number is between 1 and 5")
        in 6..10 -> println("Number is between 6 and 10")
        else -> println("Number is not between the ranges")
    }
    if (read != null) {
        if (read.length > 5) {
            println("Long name")
        } else {
            print("Short name")
        }
    }

}