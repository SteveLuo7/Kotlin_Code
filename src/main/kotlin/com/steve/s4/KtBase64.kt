package com.steve.s4

//  TODO Kotlin语言的集合转换和快捷函数学习

fun main() {

    val list = mutableListOf("Ronaldo", "Cristiano", "Cristiano", "Ronaldinho")

    val set = list.toSet()

    println(list)
    println(set)

    val list2 =list.toSet().toList()
    println(list2)

    println(list.distinct())

}