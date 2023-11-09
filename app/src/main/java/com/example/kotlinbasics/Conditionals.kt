package com.example.kotlinbasics

fun main(){
    var age = readln().toInt()
    var name = "i am a mence to society"
    if (age >= 18 ){
        println("you are allowed to vote")
    }else{
        println(name.uppercase())
    }
    //now to take input from user we use readln function in kotlin, instead of creating a scanner object like in java

}