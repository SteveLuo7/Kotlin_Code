package com.steve.s2

//  TODO Kotlin函数的takeUnless内置函数


fun main() {

    val result = checkPermissionAction1("Steve","Root")
    println(result)
}

public fun checkPermissionAction1(username: String, userpwd: String) : String? {
    return username.takeUnless {
        permissionSystem(username,userpwd)
    }
}

private fun permissionSystem(username: String, userpwd: String) : Boolean {

    return if (username == "Root" && userpwd == "Root") true else false
}