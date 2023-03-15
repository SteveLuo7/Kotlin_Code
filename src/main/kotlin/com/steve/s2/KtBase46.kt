package com.steve.s2

//  TODO Kotlin语言的==和===的区别

fun main() {
    // == 值 内容的比较 相当于java的equals
    //=== 引用的比较

    val name1 = "Steve"
    val name2 = "Steve"
    val name3 = "abc"

    println(name1.equals(name2))
    println(name1 == name2)

    println(name1 === name2)
    println(name1 === name3)

    val name4 = "steve".capitalize()
    println(name1 == name4)
    println(name1 === name4)

}