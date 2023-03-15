package com.steve.s2

//  TODO kotlin语言的let内置函数

fun main() {

    val list = listOf(6, 5, 4, 3, 2, 1)
    val value1 = list.first()
    val result1 = value1 + value1
    println(result1)


    listOf(6, 5, 4, 3, 2, 1).let {
        println(it.first() + it.first())
    }




}