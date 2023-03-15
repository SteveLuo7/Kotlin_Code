package com.steve.s4

import java.util.concurrent.ThreadLocalRandom

//  TODO Kotlin语言的惰性加载

class KtBase79 {

    //下面是不使用惰性初始化 by lazy  使用普通方式

//    val  databaseData1 : String = readSqlSeverDatabaseAction()

    val databaseData2 by lazy {
        readSqlSeverDatabaseAction()
    }

    private fun readSqlSeverDatabaseAction(): String {
        println("loading read SqlSeverDatabase....")
        println("loading read SqlSeverDatabase....")
        println("loading read SqlSeverDatabase....")
        println("loading read SqlSeverDatabase....")
        println("loading read SqlSeverDatabase.... ")
        println("loading read SqlSeverDatabase....")
        println("Finishing load read SqlSeverDatabase....")
        return "Database data load success"
    }

}

fun main() {

    val p = KtBase79()
    Thread.sleep(5000)
    println("Ready to Use")
    println("Final Result: ${p.databaseData2}")
}