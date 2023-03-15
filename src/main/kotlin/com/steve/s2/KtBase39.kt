package com.steve.s2

//  TODO Kotlin语法中对比使用if判断null值情况

fun main() {
    var name: String? = null

    name = "steve"
    if (name != null) {
        val r = name.capitalize()
        println(r)
    } else {
        println("name is null")
    }
}