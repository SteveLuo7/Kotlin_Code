package com.steve.s2

//  TODO Kotlin语言的函数引用学习

fun main() {

    //lambaa属于函数类型的对西那个，需要把methodResponseResult普通函数变成函数类型的对象 （函数引用）

    login("Steve","123456", ::methodResponseResult)

}

fun methodResponseResult(msg: String, code: Int) {
    println("FINAL LOGIN RESULT: msg:$msg, code:$code")
}


const val USER_NAME_SAVE_DB4 = "Steve"
const val USER_PWD_SAVE_DB4 = "123456"


inline fun login(name: String, pwd: String, responseResult: (String, Int) -> Unit) {
    if (USER_NAME_SAVE_DB4 == name && USER_PWD_SAVE_DB4 == pwd) {
        responseResult("Login Success", 200)
    } else {
        responseResult("Login Failed", 444)
    }
}