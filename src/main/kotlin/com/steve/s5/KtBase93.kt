package com.steve.s5

//  TODO Kotlin语言的结构声明学习

class Student1(var name: String, var age: Int, var sex: Char) {

    operator fun component1() = name
    operator fun component2() = age
    operator fun component3() = sex
}

data class Student2a(var name: String, var age: Int, var sex: Char) {

}

fun main() {

    val (name, age, sex) = Student1("Cristiano", 38, 'M')
    println("普通类 结构 name: $name, age: $age, sex: $sex")

    val (name1, age1, sex1) = Student2a("Luoshibin", 28, 'M')
    println("data类 解构: name: $name1, age: $age1, sex: $sex1")

}