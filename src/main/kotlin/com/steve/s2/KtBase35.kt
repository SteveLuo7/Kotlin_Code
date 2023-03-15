package com.steve.s2

//  TODO Kotlin语言的可空性特性

fun main() {

    // TODO 第一种情况 默认不可空 不能随意给null
    var name: String = "Steve"

    println(name)

    //TODO 第二种情况： 声明指定为可空类型

    var name2: String ?
    name2 = null
    println(name2)

}