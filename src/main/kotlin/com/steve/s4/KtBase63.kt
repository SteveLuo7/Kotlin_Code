package com.steve.s4

//  TODO Kotlin语言的可变set集合

fun main() {

    val set = mutableSetOf("Ronaldo", "Ronaldinho", "Robinho")

    set.add("Cristiano")
    set.add("Benzema")
    set.remove("Robinho")

    println(set)

}