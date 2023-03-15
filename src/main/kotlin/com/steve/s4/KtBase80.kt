package com.steve.s4

//  TODO Kotlin语言的初始化陷阱


class KtBase80 {

    var number = 9

    init {
        number = number.times(9)
    }
}

fun main() {

    println(KtBase80().number)

}