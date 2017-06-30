package com.`fun`.kotlin

/**
 * @author lujun.xlj
 * @date 2017/6/28
 */


//sampleStart
fun sum(a: Int, b: Int): Int {
    return a + b
}


//sampleEnd

fun main(args: Array<String>) {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))
}

interface A {
    fun foo() {
        print("A")
    }

    fun bar()
}

interface B {
    fun foo() {
        print("B")
    }

    fun bar() {
        print("bar")
    }
}

class C : A {
    override fun bar() {
        print("bar")
    }
}

class D : A, B {
    override fun foo() {

    }

    override fun bar() {
        
    }
}

