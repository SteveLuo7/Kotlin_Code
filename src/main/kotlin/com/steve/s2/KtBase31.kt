package com.steve.s2

//  TODO 函数中定义 参数是函数的函数

fun main() {

    loginAPI3("Steve","12346") {
        msg: String, code: Int ->
        println("Final LoginResult: msg:$msg, code:$code")
    }

}

const val USER_NAME_SAVE_DB = "Steve"
const val USER_PWD_SAVE_DB3 = "123456"

public fun loginAPI3(username: String, userpwd: String, responseResult:(String, Int) -> Unit) {
    if (username == null || userpwd == null){
       TODO("Non Existence Username or Wrong Password")
    }

    //做很多的校验  前段校验
    if (username.length > 3 && userpwd.length > 3) {
        if (webServiceLoginAPI3(username, userpwd)) {
            //可以做很多事 校验成功信息等
            responseResult("Login Sucess", 200)
        } else {
            responseResult("Login Failed", 444)
        }
    } else {
        TODO("Username or Password is not qualified")
    }
}

private fun webServiceLoginAPI3(name: String, pwd: String) : Boolean {
    return name == USER_NAME_SAVE_DB && pwd == USER_PWD_SAVE_DB3
}