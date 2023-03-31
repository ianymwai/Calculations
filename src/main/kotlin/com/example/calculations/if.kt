package com.example.calculations

//program to demonstrate kotlin nested if statement. Source https://www.javatpoint.com/kotlin-if-expression
fun main() {
    println("Enter a number 1:\n")
    val num1 = Integer.valueOf(readlnOrNull())
    println("Enter a number 2:\n")
    val num2 = Integer.valueOf(readlnOrNull())
    println("Enter a number 3:\n")
    val num3 = Integer.valueOf(readlnOrNull())

    val result = if (num1 > num2) {
        val max = if (num1 > num3) {
            num1
        } else {
            num3
        }
        "body of if$max"
    } else if (num2 > num3) {
        "body of else if $num2"
    } else {
        "body of else $num3"
    }
    println(result)
}