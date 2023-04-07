package com.example.calculations

//Demo for abstract class
abstract class Bank {
    abstract fun simpleInterest(p:Int, r:Double, t:Int): Double
}

class KCB : Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
        return (p*r*t)/100
    }
}

class ABSA : Bank() {
    override fun simpleInterest(p: Int, r: Double, t: Int): Double {
        return (p*r*t)/100
    }
}

fun main() {
    //create objects from the classes
    var kcbBank = KCB()
    var absaBank = ABSA()

    var loanA = kcbBank.simpleInterest(200000, 5.00, 2)
    var loanB = absaBank.simpleInterest(200000, 8.00, 2)

    println("KCB loan interest to be repaid will be $loanA")
    println("ABSA loan interest to be repaid will be $loanB")
}