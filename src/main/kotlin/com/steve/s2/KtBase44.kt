package com.steve.s2

//  TODO Kotlin语言的split操作

fun main() {
    val jsonText = "Steve,Chris,Juliet,Mark"

    val list = jsonText.split(",")

    val (v1,v2,v3,v4) = list

    println(list)
    println("1:$v1, 2:$v2, 3:$v3, 4:$v4")
}