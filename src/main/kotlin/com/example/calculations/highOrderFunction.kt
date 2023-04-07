package com.example.calculations

/*High Order Function accepts function as a parameter
or returns a function or does both
*/

fun myFun(org: String, portal: String, fn: (String, String) -> String) {
    val result = fn(org, portal)
    println(result)
}

fun main() {
    val fn: (String, String) -> String = {org, portal -> "$org developed $portal"}
    myFun("Ian", "this", fn)
}