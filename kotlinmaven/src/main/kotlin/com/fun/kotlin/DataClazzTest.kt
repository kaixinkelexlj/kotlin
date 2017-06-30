package com.`fun`.kotlin

/**
 * @author lujun.xlj
 * @date 2017/6/30
 */
class DataClazzTest() {


}


data class User(var id: Long, var name: String) {

}


fun main(args: Array<String>) {
    println(User(1, "xingmo").id);
}