package com.steve.s2

//  TODO Kotlin语言的apply内置函数

fun main() {

    val info = "Steve Hello"

    //普通的方式
    println("info字符串的长度：${info.length}")
    println("info最后一个字符是：${info[info.length-1]}")
    println("info转换为小写:${info.toLowerCase()}")

    val infoNew : String = info.apply {
        println(this)   //this == info

        println(this.lowercase())
        println(this.length)
        println(this[this.length - 1])

    }


}
