package com.example.calculations

/*
* Derived classes inheritance from superclass methods by using SUPER keyword
*/

open class Mazda {
    open var color = "Black"
    open fun speed () {
        println("Mazda 700 Horse Power")
    }
}

interface Toyota {
    fun speed() {
        println("Toyota 700 Horse Power")
    }
}

class Jeep: Mazda(), Toyota {
    override var color = "Green"
    override fun speed() {
        super<Mazda>.speed()
        super<Toyota>.speed()
        println("Jeep 700 Horse Power")
    }
}

fun main() {
    val c = Jeep()
    c.speed()

    val obj1 = Programmer("Ian", "Coding", 40000f)
    obj1.programs()
    val obj2 = Salesman("Lan", "Marketing", 40000f)
    obj2.fieldWork()

}

open class Employee(name: String, salary: Float) {
    init {
        println("Name is $name")
        println("Salary is $salary")
    }
}

class Programmer (name: String, dept: String, salary: Float): Employee(name, salary) {
    init {
        println("Name $name of department $dept with salary.")
    }
    fun programs() {
        println("Programming")
    }
}

class Salesman(name: String, dept: String, salary: Float): Employee(name, salary) {
    init {
        println("Name $name of department $dept with salary $salary")
    }
    fun fieldWork() {
        println("Making sales")
    }
}