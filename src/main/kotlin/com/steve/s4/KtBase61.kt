package com.steve.s4

//  TODO Kotlin语言的结构语法过滤元素学习

fun main() {

    val list = listOf("Ronaldo", "Ronaldinho", "Robinho", "Mbappe", "Neymar", "Benzema")

    val(value1, value2, value3) = list

    println(("value1: $value1, value2: $value2, value3: $value3"))

    var(v1, v2, v3, v4, v5) = list
    v1 = "ok"
    println(("v1: $v1, v2: $v2, v3: $v3, v4: $v4, v5: $v5"))

    val (n1, _, n3) = list
    println(("n1: $n1, n3: $n3"))


}