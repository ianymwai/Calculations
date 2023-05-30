package com.example.calculations

fun main() {
    val name = "Mwai"

    //this
    name.run {
        println("The name length is $length")
        println("The name length is ${this.length}")
    }

    //it
    name.let {
        println("The length is ${it.length}")
    }

}