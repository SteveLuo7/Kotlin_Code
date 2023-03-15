package com.steve.s4

//  TODO Kotlin语言的可变map集合

fun main() {

    val map = mapOf(Pair("steve", 28), Pair("juliet", 25))

    val map1 = map.toMutableMap()

    map1 += "Cristiano" to 38
    println(map1)

}