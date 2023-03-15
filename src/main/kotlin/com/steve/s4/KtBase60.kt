package com.steve.s4

//  TODO Kotlin语言的List集合遍历学习

fun main() {

    val list = listOf(1,2,3,4,5,6,7)

    println(list)

    //1、 for循环遍历
    for (i in list) {
        println("元素： $i")

    }

    //2、 for Each
    list.forEach{
        println(("元素：$it"))
    }

    //3、 下标相关遍历方式
    list.forEachIndexed {
        index, item ->
        print(("下标: $index, 元素：$item"))
    }

}