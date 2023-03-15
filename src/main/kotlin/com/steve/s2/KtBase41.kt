package com.steve.s2

//  TODO Kotlin语法中异常处理与自定义异常特点

fun main() {

    try {
        var info: String? = null

        checkException(info)

        println(info!!.length)
    } catch (e: Exception) {
        println("Oops:$e")
    }

}

fun checkException(info: String?) {
    info ?: throw CustomException()
}

class CustomException : IllegalArgumentException("Code Wrong")