package com.steve.s5

//  TODO

open class Person(val name: String) {

    private fun showName() = "This name is $name"

    open fun myPrintln() = println(showName())
}

class Student(val subName: String) : Person(subName) {

    private fun showName() = "this student name is ${subName}"

    override fun myPrintln() = println(showName())


}
fun main() {
    val person = Student("luoshibin")
    person.myPrintln()
}