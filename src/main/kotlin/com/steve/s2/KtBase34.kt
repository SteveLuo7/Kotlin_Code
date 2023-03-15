package com.steve.s2

//  TODO Kotlin的匿名函数和具名函数

fun main() {

    showPersonInfo("luoshibin", 28, '男',"Kotlin") {
        println("学习结果：$it")
    }

    showPersonInfo("Zhuliping",25,'女', "C++", ::showResultImpl)

}

fun showResultImpl(result: String) {
    println("Result:$result")
}

inline fun showPersonInfo(name: String, age: Int, sex: Char, study: String, showResult: (String) -> Unit) {
    val str ="name:$name, age:$age, sex:$sex, study:$study"
    showResult(str)
}