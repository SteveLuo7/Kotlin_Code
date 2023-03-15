package com.steve.s1

//  TODO Kotlin 函数头学习

fun main() {
    method01(28,"Luoshibin")

}
//函数默认都是public
//kotlin的函数更规范，现有输入，后有输出

private fun method01(age: Int, name: String) : Int {
    println("你的名字是：$name, 你的年龄是：$age")
    return 200

}