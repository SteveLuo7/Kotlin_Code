package com.steve.s2

// TODO Kotlin语言的函数类型和隐式返回

fun main() {

    //第一步：函数输入输出的声明

    val methodAcion : () -> String

    //第二部：对上述函数的实现
    methodAcion = {
        "Steve"
    }
    //第三步 调用该函数

    println(methodAcion())

}