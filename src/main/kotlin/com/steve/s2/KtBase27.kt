package com.steve.s2

//  TODO Kotlin语言的匿名函数的类型推断

fun main() {

    val method1 = {v1:Double, v2:Float, v3:Int ->
        "v1:$v1, v2:$v2, v3:$v3"
    }
    println(method1(45.3, 234.4f, 99))

    val method2 = {
        34356.3f
    }
    println(method2())

    val method3 = { number: Int ->
        number
    }
    println(method3(9))
}