package com.steve.s2

//  TODO Kotlin语言的with内置函数

fun main() {

    val str = "hello my name is luoshibin"

    val r1 = with(str) {
        println(this.length)
    }

}