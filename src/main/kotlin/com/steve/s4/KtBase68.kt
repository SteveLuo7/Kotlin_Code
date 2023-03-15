package com.steve.s4

//  TODO Kotlin语言的遍历map学习

fun main() {

    val map = mapOf(Pair("steve", 150), Pair("juliet", 80), Pair("Cristiano", 777))

    map.forEach {
        //it == 每一个元素 K 和 V
        //it == Map。
        println("K：${it.key} V: ${it.value}")
    }


    map.forEach { key, value ->
        //默认第一个是key
        println("Key: $key, value: $value")

    }


    map.forEach { (k, v) ->
        println("K: $k, v: $v")

    }

    for (i in map) {
        println(i)
    }
}