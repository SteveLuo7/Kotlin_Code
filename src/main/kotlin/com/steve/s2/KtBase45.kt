package com.steve.s2

//  TODO Kotlin语言的replace完成加密解码操作

fun main() {

    val sourcePwd = "abcdlajdkfejfklajfelejkaldsfjla"

    println("原始密码为：$sourcePwd")

    //加密操作
    val r1 = sourcePwd.replace(Regex("[asdf]")) {
//        it.value
        when(it.value){
            "a" -> "9"
            "s" -> "7"
            "d" -> "6"
            "f" -> "3"
            else -> it.value
        }
    }
    println("加密操作后的密码为：$r1")
}
