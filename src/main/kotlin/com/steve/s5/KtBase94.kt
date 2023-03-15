package com.steve.s5

//  TODO Kotlin语言运算符重载

data class addClass(var number1: Int, var number2: Int) {
    operator fun plus(p1: addClass) : Int{
        return (number1 + p1.number1) + (number2 + p1.number2)
    }
}
fun main() {

    addClass(1, 1) + addClass(2, 2)
}