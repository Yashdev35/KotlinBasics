package com.example.kotlinbasics

import androidx.core.graphics.component1
import androidx.core.graphics.component2
import androidx.core.graphics.component3

fun main(){
    var a = readln().toInt()
    var b = readln().toInt()
var addition = addNumbers(a, b)
    println(addition)
}
//to get return from a function in kotlin we use : and then specify the type of return
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}