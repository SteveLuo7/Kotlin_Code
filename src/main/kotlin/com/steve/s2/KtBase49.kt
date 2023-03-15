package com.steve.s2

import kotlin.math.roundToInt

//  TODO Kotlin语言中Double转Int与类型格式化

fun main() {

    println(65.8789456.toInt())

    println(56.4564564.roundToInt())
    println(56.8564564.roundToInt())
    //roundtoInt 是四舍五入  toin向下取整

    val r = "%.3f".format(65.8789456)
    println(r)
}