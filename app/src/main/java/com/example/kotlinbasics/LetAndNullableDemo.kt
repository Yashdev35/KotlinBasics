package com.example.kotlinbasics

fun main(){
    //this concept is some what similar ot copy
    //nullable string
    var name: String? = "yash"
    //now we can use the let keyword to access the name variable
    //let keyword is used to access the variable, if it is not null
    name?.let {
        println(it.uppercase())
    }
}
//now let copy and map we will use in the shopping list app for better modification