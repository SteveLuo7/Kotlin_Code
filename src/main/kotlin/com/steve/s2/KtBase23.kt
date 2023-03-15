package com.steve.s2

// TODO Kotlin语言的匿名函数学习

fun main() {
    val len = "Steve".count()
    println(len)

    val len2 = "Steve".count() {
        it == 'e'
        // it 等于 S t e v e 的字符 char
    }
    println(len2)

}