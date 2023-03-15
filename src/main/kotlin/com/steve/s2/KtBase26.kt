package com.steve.s2

//  TODO Kotlin语言的it关键字的特点

fun main() {

    val methodAction : (Int, Int, Int) -> String = {n1,n2,n3 ->
        val number =123456
        println("$number Steve, n1:$n1, n2:$n2, n3:$n3")
        "$number Steve, n1:$n1, n2:$n2, n3:$n3"
    }
    methodAction.invoke(1,2,3)
    methodAction(1,2,3)

    val methodAction2 : (String) -> String = {"$it Steve"}

    println(methodAction2("ABC"))

    val methodAction3 : (Double) -> String = {"$it Steve2"}
    println(methodAction3(888.8))
}