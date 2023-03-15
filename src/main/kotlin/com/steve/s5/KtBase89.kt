package com.steve.s5

//  TODO Kotlin伴生对象的学习
class KtBase89 {

    companion object {
        val info: String = "Steve is GOAT"

        fun showInfo() = println("$info")
    }
}

fun main() {

    println(KtBase89.info)

    KtBase89.showInfo()
}