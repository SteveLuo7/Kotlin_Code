package com.steve.s2

//  TODO Kotlin语言的Lambda表达式

fun main() {

    //匿名函数 == lambda表达式
    val addResultMethod = { number1: Int, number2 :Int->
        "两数字相加的结果为： ${number1 + number2}"
    }
    println(addResultMethod(2, 4))

    //匿名函数 入参 Int， 返回 any类型
    //lambda表达式的 参数Int， lambda表达式的结果Any类型
    val weekResultMethod = {number: Int ->
        when(number) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> -1
        }
    }
    println(weekResultMethod(2))
}