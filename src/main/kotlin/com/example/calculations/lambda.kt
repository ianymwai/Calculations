package com.example.calculations

//normal function
fun add(x: Int, y: Int ) {
    val sum = x + y

    println("The sum is $sum")
}

fun main() {
    add(2,5)

    val mylambda: (Int) -> Unit = {s: Int -> println(s)}
    addition(10, 10, mylambda)
}

/*
* Lambda is a function which has no name
*Syntax -> {variable -> bodyOfFunction}
*/

fun addition(a: Int, b: Int, mylambda: (Int) -> Unit) {// high level/order function lambda as parameter
    val result = a + b
    mylambda(result)
}
