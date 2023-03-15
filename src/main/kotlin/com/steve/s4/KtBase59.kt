package com.steve.s4

//  TODO Kotlin语言的mutator函数学习

fun main() {

    val list = mutableListOf("Steve", "Chris", "Juliet", "Macheal")

    list += "Ronaldo"
    list += "Ronaldinho"
    list -= "Chris"

    println(list)

    list.removeIf { it.contains("Ron")} //过滤所有元素 按需过滤

    println(list)
}