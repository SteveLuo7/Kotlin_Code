package com.steve.s2

//  TODO Kotlin语言的函数参数学习

fun main() {

    //  第一步 ： 函数输入和输出的声明
    val methodAction : (Int, Int, Int) -> String = { number1, number2, number3 ->
        val inputValue = 99999
        "$inputValue 参数1：$number1, 参数2：$number2, 参数3: $number3"

    }

    println(methodAction(1,2,3))
}