package com.steve.s5

//  TODO kotlin对象表达式

open class KtBase88 {

    open fun add(info: String) = println("KtBase8 add : $info")
    open fun del(info: String) = println("KtBase8 del : $info")

}
fun main() {

    val p : KtBase88 = object : KtBase88() {

        override fun add(info: String) {
//            return super.add(info)
            println("我是匿名兑现 add: $info")
        }

        override fun del(info: String) {
//            return super.del(info)
            println("我是匿名对象 del: $info")
        }
    }

    p.add("Cristiano")
    p.del("Cristiano")

}