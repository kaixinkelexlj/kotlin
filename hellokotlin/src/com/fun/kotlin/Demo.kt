package com.`fun`.kotlin

/**
 * @author lujun.xlj
 * @date 2017/6/29
 */
class Demo {

    var counter = 1 // 此初始器值直接写入到幕后字段
        set(value) {
            if (value > 0)
                field = value
        }

}


fun main(args: Array<String>) {
    var m = Demo();
    m.counter = 0;
    println(m.counter);
    m.counter = 100;
    println(m.counter);
}