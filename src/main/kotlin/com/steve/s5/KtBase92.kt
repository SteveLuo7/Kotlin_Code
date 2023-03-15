package com.steve.s5

import com.steve.s1.age

//  TODO Kotlin语言的copy函数学习

data class KtBase92 (var name: String, var age: Int) {

    var coreInfo : String = ""

    init {
        println("主构造被调用了")
    }

    constructor(name: String) : this(name, 38) {
        println("次构造被调用")
        coreInfo = "这是十分核心的内容信息"
    }

    override fun toString(): String {
        return "toString name: $name, age: $age, coreinfo: $coreInfo"
    }
}

fun main() {

    val p1 = KtBase92("Cristiano")
    println(p1)

    val p2 = p1.copy("benzena", 35)
    println(p2)

}