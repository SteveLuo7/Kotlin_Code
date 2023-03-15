package com.steve.s4

import java.io.File

//  TODO Kotlin语言中的数组类型


fun main() {

    val IntArray = intArrayOf(1,2,3,4,5)

    println(IntArray[0])
    println(IntArray[1])
    println(IntArray[2])
    println(IntArray[3])
    println(IntArray[4])
//    println(IntArray[5]) //奔溃了

    println(IntArray.elementAtOrElse(0, {-1}))
    println(IntArray.elementAtOrElse(1, {-1}))
    println(IntArray.elementAtOrElse(2, {-1}))
    println(IntArray.elementAtOrElse(3, {-1}))
    println(IntArray.elementAtOrElse(4, {-1}))
    println(IntArray.elementAtOrElse(5, {444}))

    println(IntArray.elementAtOrNull(0) ?: "out of bounds")
    println(IntArray.elementAtOrNull(1) ?: "out of bounds")
    println(IntArray.elementAtOrNull(2) ?: "out of bounds")
    println(IntArray.elementAtOrNull(3) ?: "out of bounds")
    println(IntArray.elementAtOrNull(4) ?: "out of bounds")
    println(IntArray.elementAtOrNull(5) ?: "out of bounds")

    val charArray = listOf('a', 'b', 'c').toCharArray()
    println(charArray)

    val obj = arrayOf(File("aaa"), File("bbb"), File("ccc"))
    println(obj)


}