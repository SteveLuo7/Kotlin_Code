package com.steve.s4

//  TODO


fun main() {

    val list = listOf<String>("zhangsan", "lisi", "wangwu")

    println(list[0])
    println(list[1])
    println(list[2])

    //防止崩溃取值方式

    println(list.getOrElse(3){"out of bound"})

    println(list.getOrNull(4)?: "out of bound" )

}