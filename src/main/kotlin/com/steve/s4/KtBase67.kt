package com.steve.s4

//  TODO Kotlin语言读取Map的值

fun main() {

    val map = mapOf("steve" to 666, "juliet" to 115)
    println(map["steve"])

    println(map["juliet"])

    println(map["Cristiano"])
    //找不到 返回null

    println(map.getOrDefault("steve", -1))
    println(map.getOrDefault("Cristiano", -1))

    println(map.getOrElse("david") { 444 })

}