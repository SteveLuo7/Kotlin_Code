package com.steve.s1

// TODO 13.Kotlin 的range 表达式

fun main() {
    val number = 148

    // range 范围  从哪里  到哪里

if (number in 10..59) {
    println("不及格")
} else if (number in 0..9){
    println("很差")
} else if(number in 60..100) {
    println("合格")
} else if (number !in 0..100) {
    println("数据错误")
}

}