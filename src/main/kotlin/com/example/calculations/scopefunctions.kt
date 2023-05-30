package com.example.calculations

import kotlin.random.Random


fun writeToLog(message: String) {
    println("INFO: $message")
}

fun main() {

    val num = 100
    fun getRandomInt(): Int {
        return Random.nextInt(num).also {
            writeToLog("getRandomInt() generated value $it")
        }
    }

    val i = getRandomInt()
    println(i)

    val numberList = mutableListOf<Double>()
    numberList.also { println("Populating the list") }
        .apply {
            add(2.71)
            add(3.14)
            add(1.0)
        }
        .also { println("Sorting the list") }
        .sort()
    println(numberList)

    //run
    val numbers = mutableListOf("one", "two", "three")
    val countEndsWithE = numbers.run {
        add("four")
        add("five")
        count { it.endsWith("o") }
    }
    println("There are $countEndsWithE elements that end with e.")

    //with
    val nums = mutableListOf("one", "two", "three")
    with(nums) {
        val firstItem = first()
        val lastItem = last()
        println("First item: $firstItem, last item: $lastItem")
    }

    //let
    val nos = mutableListOf("one", "two", "three", "four", "five")
    val resultList = nos.map { it.length }.filter { it > 3 }
    println(resultList)

}