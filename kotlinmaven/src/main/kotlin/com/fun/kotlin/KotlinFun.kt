package com.`fun`.kotlin

fun main(args: Array<String>) {
    val list = listOf("ABC", 1, 2, 3, "hello", "world", "abc")
    val nums = list.filter { it is Int && it > 1 }
    print(nums)

}


class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

val instance = MyClass.create()

class MyClass2 {
    companion object {

    }
}

val x = MyClass2.Companion