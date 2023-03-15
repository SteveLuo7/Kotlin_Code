package com.steve.s4

//  TODO Kotlin语言的计算属性 与 防范竞态条件

class KtBase70 {
    val number: Int = 0

    val number2: Int
        get() = (1..10000).shuffled().first()


    val info: String ?=  "Cristiano is GOAT"

    fun getShowInfo() : String {

        return info?.also {
            "Final Result INFO: $it"
        } ?: "Null check your code"
    }
}



fun main() {

    println(KtBase70().number)
    println(KtBase70().number2)

    println(KtBase70().getShowInfo())


}