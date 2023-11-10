package com.example.kotlinbasics

class Lists {
    var list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)//this is similar to arrays
    //and mutable list is similar to array list in java
    var mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    // we can create variables in the class but cannot use method on them like .add in this case , for that we have to use method like main



}
fun main(){

    var list  = Lists()
    list.mutableList.add(10)
    println(list.mutableList + list.list)
    //for(item in list) kotlin == for(object item : list) java
    //for(item in 0..list.size) kotlin == for(int i = 0; i < list.size; i++) java
}