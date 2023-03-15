package com.steve.s4

//  TODO Kotlin语言的set创建于元素获取

fun main() {

    val set = setOf("lisi", "wangwu", "zhaoliu", "zhaoliu")

    println(set)

    //没有set【0】的功能去获取元素

    println(set.elementAt(0))
    println(set.elementAt(1))
    println(set.elementAt(2))
//    println(set.elementAt(3))

    println(set.elementAtOrElse(0) { "out of bounds" })
    println(set.elementAtOrElse(1) { "out of bounds" })
    println(set.elementAtOrElse(2) { "out of bounds" })
    println(set.elementAtOrElse(3) { "out of bounds" })

    println(set.elementAtOrNull(0) ?: "!!!" )
    println(set.elementAtOrNull(1) ?: "!!!" )
    println(set.elementAtOrNull(2) ?: "!!!" )
    println(set.elementAtOrNull(3) ?: "!!!" )

}