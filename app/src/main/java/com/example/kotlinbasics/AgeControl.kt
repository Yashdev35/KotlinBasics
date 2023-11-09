package com.example.kotlinbasics

fun main(){
    print("Enter your age: ")
    var age = readLine()!!.toInt()//readLINe() is used to take input from user,!! is used to make sure that the input is not null
    //toInt() is used to convert the input to integer
    if(age in 18..150) {//the && and other code was converted to a range
        println("You are allowed to vote")
    }else if(age in 0..17) {
        println("You are not allowed to vote")
    }else if (age > 150) {
        println("You are not a human")
    }

}
