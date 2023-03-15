package com.steve.s2

//  TODO Kotlin中使用let的安全调用

fun main() {

    var name: String? = null
    name = "steve"
    name = ""
    val r = name?.let {
        //it == name 本身
        // 如果能够执行到括号里面 it一定不为null
        if (it.isBlank()){
            "Default"
        } else {
            "[$it]"
        }
    }
    println(r)

}