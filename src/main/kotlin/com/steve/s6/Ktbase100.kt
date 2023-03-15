package com.steve.s6

interface IUSB {
    var usbVersionInfo: String
    var usbInsertDevice: String

    fun insertUSB() : String
}

class Mouse(
    override var usbVersionInfo: String= "USB 3.2",
    override var usbInsertDevice: String = "鼠标已插入") : IUSB {

    override fun insertUSB(): String = "Mouse $usbVersionInfo, $usbInsertDevice"

}

class Keyboard : IUSB {

    override var usbVersionInfo: String = "USB3.1"
        get() = field
        set(value) {
            field = value
        }

    override var usbInsertDevice: String = "键盘插入了USB"
        get() {
            println("@你get了[${field}]值出去了")
            return field
        }

        set(value) {
            field = value;
            println("@你set了[${value}]值出去了")

        }

    override fun insertUSB(): String = "Keyboard $usbVersionInfo, $usbInsertDevice"
}

fun main() {

    val iusb1: IUSB = Mouse()
    println(iusb1.insertUSB())

    val iusb2: IUSB = Keyboard()
    println(iusb2.insertUSB())

    iusb2.usbInsertDevice = "aaa"
}