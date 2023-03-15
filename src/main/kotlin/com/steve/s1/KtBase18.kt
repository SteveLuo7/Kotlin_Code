package com.steve.s1


//  TODO Kotlin上网具名函数参数

fun main() {

    LoginAction("steveluo", "luo010495", "15538046180")
}

private fun LoginAction(userName: String,userpwd: String, phonenumber: String) {
    println("username = $userName  userpassword = $userpwd   userphone = $phonenumber")
}