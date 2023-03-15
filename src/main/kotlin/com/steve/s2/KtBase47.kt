package com.steve.s2

//  TODO Kotlin语言的字符产遍历操作

fun main() {

    val str = "abcdefghijklmnopqrstuvwxyz"
    str.forEach {
        println("所有的字符是：$it ")
    }

    str.forEach {
        c ->
        println("所有字符为： $c")
    }
}