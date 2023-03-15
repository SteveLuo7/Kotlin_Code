package com.steve.s4

//  TODO Kotlin语言的构造初始化顺序

class KtBase77 (_name: String, val sex: Char) {

    val mName = _name

    init {
        val nameValue: String = _name
        println("init代码块打印：nameValue: $nameValue")
    }

    constructor(name: String, sex: Char, age: Int): this(name, sex) {
        println("次构造 三个参数的 name: $name, sex: $sex, age: $age")
    }


}


fun main() {

    KtBase77("Cristiano", 'M', 38)
}