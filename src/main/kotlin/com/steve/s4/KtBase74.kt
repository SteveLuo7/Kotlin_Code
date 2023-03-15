package com.steve.s4

//  TODO Kotlin语言的次构造函数学习

class KtBase74(name: String) {

    constructor(name: String, sex: Char): this(name) {
        println("name: $name, sex: $name")
    } //主构造统一管理

    constructor(name: String, sex: Char, age: Int): this(name) {
        println("name: $name, sex: $sex, age: $age")
    }
    constructor(name: String, sex: Char, age: Int, info: String): this(name) {
        println("name: $name, sex: $sex, age: $age, info: $info")
    }
}

fun main() {

    val p = KtBase74("Cristiano")

    KtBase74("steve", 'M')
    KtBase74("steve", 'M', 28)
    KtBase74("steve", 'M', 28, "GOAT")


}