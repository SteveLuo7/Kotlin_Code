package com.steve.s4

//  TODO
class KtBase82 (_info: String){

    private val info = _info

    val content = getInfoMethod()

    fun getInfoMethod() = info
}

fun main() {

    println("The actually length is: ${KtBase82("steve").content.length}")
}