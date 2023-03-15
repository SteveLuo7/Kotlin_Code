package com.steve.s5

import java.io.File

//  TODO

open class Person2(val name: String) {

    fun showName2() = "This name is $name"

    open fun myPrintln() = println(showName2())
}

class Student2(val subName: String) : Person2(subName) {

    private fun showName() = "this student name is ${subName}"

    override fun myPrintln() = println(showName())


}
fun main() {
    val p: Person2 = Student2("罗仕斌")
    p.myPrintln()

    println(p is Person2)
    println(p is Student2)
    println(p is File)

    if (p is Person2) {
        (p as Person2).showName2()
    }


}