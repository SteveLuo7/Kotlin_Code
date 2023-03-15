package com.steve.s1

//  TODO Kotlin中函数参数的默认参数

fun main() {
    action("Steve", 15)
    action1("Steve" )
    action2()
}

private fun action(name: String, age: Int) {
    println("My name is $name, My age is $age")
}

private fun action1(name: String, age: Int = 75) {
    println("My name is $name, My age is $age")
}
private fun action2(name: String = "Chris", age: Int = 60) {
    println("My name is $name, My age is $age")
}
