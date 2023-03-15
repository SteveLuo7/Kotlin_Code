package com.steve.s5

//  TODO Kotlin语言的枚举类定义函数

class LimbsInfo(val limbsInfo: String, val length: Int) {
    fun show() {
        println("$limbsInfo 的长度是：$length")
    }
}

enum class Limbs(private val limbsInfo: LimbsInfo) {
    LEFT_HAND(LimbsInfo("左手", 45)),
    RIGHT_HAND(LimbsInfo("右手", 45)),

    LEFT_FOOT(LimbsInfo("左脚", 120)),
    RIGHT_FOOT(LimbsInfo("右脚", 120));

    fun show() = "四肢: ${limbsInfo.limbsInfo}的长度是: ${limbsInfo.length}"

}

fun main() {

    println(Limbs.LEFT_HAND.show())
    println(Limbs.RIGHT_HAND.show())
    println(Limbs.LEFT_FOOT.show())
    println(Limbs.RIGHT_FOOT.show())
}