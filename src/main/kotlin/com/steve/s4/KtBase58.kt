package com.steve.s4

//  TODO Kotlin语言的可变List集合学习

fun main() {

    val list = mutableListOf<String>("zhangsan", "lisi", "wangwu")

    list.add("zhaoliu")

    list.remove("wangwu")

    println(list)

    val list2 = listOf(123,345,654,789)

//    list.add(888)  不可变集合 无法完成可变操作

    val list3 : MutableList<Int> = list2.toMutableList()

    list3.add(888)

    println(list3)

    val list4 = list3.toList()

//    list4.remove(888)

    println(list4)
}