package com.`fun`.kotlin

import org.junit.Test

/**
 * @author lujun.xlj
 * @date 2017/6/30
 */
class MainTest /*constructor(name: String)*/ {

    fun describe(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Greeting"
                is Long -> "Long"
                !is String -> "Not a string"
                else -> "Unknown"
            }

    @Test
    fun testWhen() {
        println(describe(1))
        println(describe("Hello"))
        println(describe(1000L))
        println(describe(2))
        println(describe("other"))
    }

}