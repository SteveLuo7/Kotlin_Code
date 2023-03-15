package com.steve.s5

//  TODO Kotlin语言的枚举

enum class Week {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}

fun main() {

    println(Week.Monday)
    println(Week.Monday is Week)
}