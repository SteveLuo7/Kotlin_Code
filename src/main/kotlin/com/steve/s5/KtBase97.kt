package com.steve.s5

//  TODO Kotlin语言的代数数据类型

enum class Exam {

    Fraction1,
    Fraction2,
    Fraction3,
    Fraction4;

    var studentName: String ?= null
}

class Teacher(private val exam: Exam) {
    fun show() =
        when (exam) {
            Exam.Fraction1 -> "该学生成绩不及格"
            Exam.Fraction2 -> "该学生成绩及格"
            Exam.Fraction3 -> "该学生成绩良好"
            Exam.Fraction4 -> "该学生成绩优秀"
        }
    }


fun main() {

    println(Teacher(Exam.Fraction1).show())
    println(Teacher(Exam.Fraction2).show())
    println(Teacher(Exam.Fraction3).show())
    println(Teacher(Exam.Fraction4).show())

}