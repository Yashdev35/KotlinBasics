package com.example.kotlinbasics

fun main(){
    //map is used to transform what ever it is iterating through
    //story of magical paintbursh which transfored every thing it touched into gold,just like that
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    val squaredNumbers = numbers.map { it*it }//this is the code to make square of every number in the list
    //it maps through each item in the list and exicutes the code in the curly braces and it symbolises the current item in the list
    println(squaredNumbers)

}
