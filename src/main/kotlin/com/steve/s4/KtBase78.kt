package com.steve.s4

//  TODO Kotlin语言的延迟初始化lateinit学习


class KtBase78 {

    lateinit var responseResultInfo: String //等会初始化 先定义再说，所以没有赋值

    fun loadRequest() { //原始初始化，属于懒加载，用到再加载

        responseResultInfo = "服务器加载成功，恭喜"
    }

    fun showResponseResult() {
        if (::responseResultInfo.isInitialized){

            println("responseResultInfo: $responseResultInfo")
        } else {
            println("You are forget to initlized responseinfo")
        }
    }
}

fun main() {

    val p = KtBase78()

    //先加载 再使用
    p.loadRequest()
    p.showResponseResult()
}