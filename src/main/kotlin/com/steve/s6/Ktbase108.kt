package com.steve.s6
class Ktbase108 <INPUT> (private val isR: Boolean, vararg objects: INPUT) {

    private val objectArray: Array<out INPUT> = objects

    fun getR1() : Array<out INPUT> ?= objectArray.takeIf { isR }
    fun getR2() : Any = objectArray.takeIf { isR } ?: "you are Null"
    fun getR3() : Any? = objectArray.takeIf { isR } ?: "you are Null"
    fun getR4(index: Int) : INPUT ? = objectArray[index].takeIf { isR } ?: null
    fun getR5(index: Int) : Any ? = objectArray[index].takeIf { isR } ?: "AAA" ?: 546 ?: 6455.543f ?: 'c' ?: false ?: null

    operator fun get(index: Int) : INPUT ? = objectArray[index].takeIf { isR }

}


fun <INPUT> inputObj(item: INPUT) {

    println((item as String?)?.length)

}

fun main() {

    inputObj("steve")
    inputObj("Cristiano")
    inputObj(null)

    val p1 : Ktbase108<String> = Ktbase108(true, "Luoshibin", "Cristiano")
    println(p1[0])
    println(p1[1])

}
