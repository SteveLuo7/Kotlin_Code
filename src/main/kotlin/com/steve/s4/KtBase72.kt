package com.steve.s4

//  TODO Kotlin语言的祝构造函数学习

class KtBase72(_name: String, _sex: Char, _age: Int, _info: String)
{
    var name = _name
        get() = field
        private set(value) {
            field = value
        }

    val sex = _sex
        get() = field

    val age = _age
        get() = field + 1

    val info = _info
        get() = "[${field}]"



    fun show() {
        println(name)
        println(age)
        println(sex)
        println(info)

    }
}

fun main() {

    val p = KtBase72(_name = "Cristiano", _info = "Learning Kotlin", _age = 38, _sex = 'M')
    println(p.name)
    p.show()
//    p.name = "steve"
}