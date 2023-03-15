package com.steve.s5

//  TODO Kotlin语言的 嵌套类学习
class Body(_bodyInfo: String) {
    val bodyInfo = _bodyInfo

    fun show() {
        Heart().run()
    }

    inner class Heart {
        fun run() = println("心脏访问身体信息：$bodyInfo")
    }

    inner class Kidney {
        fun work() = println("肾脏正在工作：$bodyInfo")
    }

    inner class Hand {
        fun work() = println("手部正在工作：$bodyInfo")
    }
}

class  Outer {

    val info = "this is String"

    fun show() {
        Nested().output()
    }

    class Nested {
        fun output() = println()
    }
}

fun main() {

    Body("isOK").Heart().run()
    Body("isOK").Kidney().work()
    Body("isOK").Hand().work()

    Outer.Nested().output()

}