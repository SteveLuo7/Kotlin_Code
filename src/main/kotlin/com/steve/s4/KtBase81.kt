package com.steve.s4

//  TODO

class KtBase81 {
    val info: String

    init {
        info = "steveisOK"
        getInfoMethod()

    }

    fun getInfoMethod() {
        println("info: $info")
    }
}

fun main() {

    KtBase81().getInfoMethod()
}