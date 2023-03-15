package com.steve.s2

//  TODO Kotlin语言的函数类型作为返回类型

fun main() {

    show1("666")
    val show = show("匿名函数返回")
    println(show("匿名函数返回我叫罗仕斌"))
}

fun show1 (info: String) {
    println("$info")
}

fun show(info: String) :(String, Int) -> String{
    println("我是show函数 info:$info")

    return {
        name: String, age: Int -> "返回成功"
    }
}