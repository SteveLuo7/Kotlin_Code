package com.steve.s2

//  TODO Kotlin语言中的非空断言操作特点

fun main() {
    var name: String? = null

    name = "steve"
    val r = name!!.capitalize() //!!不管name是不是null，都执行操作 会有java一样的空指针异常
    println(r)
}