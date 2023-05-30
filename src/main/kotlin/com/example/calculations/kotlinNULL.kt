package com.example.calculations

fun main() {
    //non-null type

    val actor: String? = null
    println(actor?.length)

    val name = if (actor == null) {
        0
    } else {
        actor?.length
    }
    println(name)


    val car: String? = "Volkswagen"

    //safe-call operator and the elvis operator
    val carLength = car?.length?:0
    println(carLength)


    //null type
    val actress: String?
    actress = null
    println(actress)

    val number: Int?
    number = null
    println(number)

    val num: String? = null
    println(num?.length)
}