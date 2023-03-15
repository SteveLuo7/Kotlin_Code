package com.steve.s4

import com.steve.s1.age
import com.steve.s2.show

//  TODO

class KtBase73 (var name: String, val sex: Char, val age: Int, var info: String) {

    fun show() {
        println(name)
        println(sex)
        println(age)
        println(info)
    }
}
fun main() {

    KtBase73(name = "Cristiano", sex = 'M', age = 38, info = "GOAT").show()


}