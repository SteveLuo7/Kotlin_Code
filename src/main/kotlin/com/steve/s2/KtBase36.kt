package com.steve.s2

//  TODO Kotlin语言的安全调用操作符

fun main() {
    var name: String ? = "steve"
//    name = null

    val r = name?.capitalize() //name是可空类型的，想要使用name，可能是null，必须给出补救措施

    println(r)
}