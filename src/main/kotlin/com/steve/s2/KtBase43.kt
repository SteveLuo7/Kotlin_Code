package com.steve.s2

//  TODO Kotlin语言的substring

const val INFO = "Steve is Success man"
fun main() {

    val indexOf = INFO.indexOf("i")
    println(INFO.substring(0, indexOf))
    println(INFO.substring(0 until indexOf)) //Kotlin 基本使用该方式
}