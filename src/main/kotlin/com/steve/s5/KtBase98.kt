package com.steve.s5

//  TODO Kotlin语言的代数数据类型

sealed class Exams {

    object Fraction1 : Exams()
    object Fraction2 : Exams()
    object Fraction3 : Exams()
    class Fraction4(val studentName: String) : Exams()

//    var studentName: String ?= null
}

class Teachers(private val exam: Exams) {
    fun show() =
        when (exam) {
            is Exams.Fraction1 -> "该学生成绩不及格"
            is Exams.Fraction2 -> "该学生成绩及格"
            is Exams.Fraction3 -> "该学生成绩良好"
            is Exams.Fraction4 -> "该学生成绩优秀, 该学生的姓名是：${(this.exam as Exams.Fraction4).studentName}"
        }
}


fun main() {

    println(Teachers(Exams.Fraction1).show())
    println(Teachers(Exams.Fraction2).show())
    println(Teachers(Exams.Fraction3).show())
    println(Teachers(Exams.Fraction4("Cristiano")).show())
    println(Teachers(Exams.Fraction4("Steve")).show())

}