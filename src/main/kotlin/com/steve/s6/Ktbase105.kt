package com.steve.s6

import com.steve.s5.Exam
import com.steve.s5.Student
import com.steve.s5.Teacher
import com.steve.s5.Teachers

class Ktbase105<T>(private val isR: Boolean, private val obj: T) {

    fun getObj() = obj.takeIf { isR }
}

fun main() {
    val stu1 = Student("Cristiano")
    val stu2 = Student("Luoshibin")



}