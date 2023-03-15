package com.steve.s4

//  TODO Kotlin语言的初始化学习

class KtBase76 (username: String, userage: Int, usersex: Char) {

    init {
        println("主构造函数被调用了")
        require(username.isNotBlank()) {"Your Username is Null !!!"}
        require(userage > 0) {"Your Userage in Not Allowed !!!"}
        require(usersex == 'M' || usersex == 'W') {"Your Usersex is Not Allowed !!!"}
    }

    constructor(username: String, userage: Int, usersex: Char, userinfo: String): this(username, userage, usersex) {
        println("username: $username, userage: $userage, usersex: $usersex, userinfo: $userinfo")
        println("次构造函数被调用了")

    }
}
fun main() {

    KtBase76("Cristiano", 38, 'M')
    println("*********************************************")
    KtBase76("Kobe", 38, 'M', "Playing NBA")
    KtBase76("Jordan", 48, 'M', "NBA WORLD CHAMPION")


}