package com.steve.s1

//  TODO Kotlin语言的Noting类型特点

fun main() {
    show(75)
}

private fun show(number: Int) {
    when(number) {
        -1 -> TODO("Mistake")
        in 0..59 -> println("Not Good")
        in 60..80 -> println("Good")
        in 80..100 -> println("Great")
    }
}

interface A {
    fun show()
}

class AImpl : A {
    override fun show() {
        //下面这句话，不是注释，会终止程序
        TODO("Not yet implemented")
    }
}