package com.example.kotlinbasics

import androidx.room.util.copy

fun main(){
    // copy keyword is used to create the copy of whatever it is called to, without changing the original thing
   val yash = NewHuman("yash",19,45,80)
    val cloneYash = yash.copy("clone Yash")// everything is same except the name, because we have changed the name
    //bracket after copy is like the constructor of the class, we can change the properties of the class by using the copy keyword
    // its use case is too access complicated objects and then change the properties of the object, that we dont have easily access to
    //and cant copy and paste the whole object
    println(yash)
    println(cloneYash)
}
data class NewHuman(val name : String, val age : Int, val height : Int, val weight : Int)