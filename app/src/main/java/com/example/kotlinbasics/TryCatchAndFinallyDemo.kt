package com.example.kotlinbasics

fun main() {
    println("Enter a number")
    try {
        val userInput = readln().toInt()
        println("the user input is $userInput")
    } catch (e: Exception) {
        println("the user input is not an integer, ${e.message}")
    }finally {
        println("this is the finally block")
    }
}