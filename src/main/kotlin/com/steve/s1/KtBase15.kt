package com.steve.s1

//  TODO Kotlin语言的String模版

fun main() {

    val garden = "黄石国家公园"
    val time = 6


    println("今天天气很晴朗，去" + garden + "玩，玩了" + time + "小时") //java 的字符串拼接
    println("今天天气很晴朗，去${garden}玩，玩了$time 小时")

    //Kotlin 的if是表达式，可以更灵活
    val islogin = true
    println("server response result: ${if(islogin) "Congratulation login success" else "Login failed"}")
}