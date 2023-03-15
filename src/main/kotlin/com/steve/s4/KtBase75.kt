package com.steve.s4

//  TODO Kotlin语言的次构造函数学习

class KtBase75(name: String) {

    constructor(name: String = "Luoshibin", sex: Char = 'M'): this(name) {
        println("name: $name, sex: $sex")
    } //主构造统一管理

    constructor(name: String = "Zhuliping", sex: Char = 'W', age: Int = 25): this(name) {
        println("name: $name, sex: $sex, age: $age")
    }
    constructor(name: String = "Cristiano", sex: Char = 'M', age: Int = 38, info: String = "Still Learning New Programming Language"): this(name) {
        println("name: $name, sex: $sex, age: $age, info: $info")
    }
}

fun main() {

    val p = KtBase75("Benzema",'M',25)


    println("----------------------")
    KtBase75()


}