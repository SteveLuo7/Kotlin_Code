package com.steve.s1

// TODO 14.Kotlin 的When 表达式

fun main() {
    val week = 5

    //java 的if 是语句
    //Kotlin 的if是表达式 是函数 要有返回值

    val info = when(week) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> {
            println("Opps")
        }
    }

    println(info)
}