package com.steve.s2

//  TODO Kotlin语言中数字类型的安全转换函数

fun main() {
    val number: Int = "666".toInt()
    println(number)

    val number2: Int? = "888".toIntOrNull()
    println(number2)


}