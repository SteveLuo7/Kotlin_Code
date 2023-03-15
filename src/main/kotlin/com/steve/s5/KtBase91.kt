package com.steve.s5

//  TODO kotlin语言中数据类的学习

class ResponseResultBean(var msg: String, var code: Int, var data: String) {

}

data class ResponseResultBean1(var msg: String, var code: Int, var data: String) {

}

fun main() {

    println(ResponseResultBean("Login Success", 200, "登陆成功"))
    println(ResponseResultBean1("Login Success", 200, "登陆成功"))


    println()


    println(
        ResponseResultBean("Login Sucess", 200, "LOGIN SUCCESS") ==
            ResponseResultBean("Login Sucess", 200, "LOGIN SUCCESS")
    )

    println()

    println(
        ResponseResultBean1("Login Sucess", 200, "LOGIN SUCCESS") ==
                ResponseResultBean1("Login Sucess", 200, "LOGIN SUCCESS")
    )
}