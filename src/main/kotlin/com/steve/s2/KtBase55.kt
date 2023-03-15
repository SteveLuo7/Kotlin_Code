package com.steve.s2

//  TODO Kotlin语言的takeIf内置函数

fun main() {

    val result = checkPermissionAction("Root","Root")
    println(result)
}

public fun checkPermissionAction(username: String, userpwd: String) : String? {
   return username.takeIf {
        permissionSystem(username,userpwd)
    }
}

private fun permissionSystem(username: String, userpwd: String) : Boolean {

    return if (username == "Root" && userpwd == "Root") true else false
}