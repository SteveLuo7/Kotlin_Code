package com.steve.s6

interface USB2 {

    val usbVersionInfo: String
        get() = (1..100).shuffled().last().toString()

    val usbInsertDevice: String
        get() = "高级设备链接USB"

    fun insertUsb() : String



}

class Mouse2 : USB2{
    override val usbInsertDevice: String
        get() = super.usbInsertDevice

    override fun insertUsb(): String = "Mouse $usbVersionInfo, $usbInsertDevice"
}

