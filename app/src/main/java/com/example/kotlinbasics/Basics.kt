package com.example.kotlinbasics

fun main() {
    println("Hello World!")
    //by default numbers are stored in integer Int , and in kotlin you dont have to assign data type it does for you but you can
    //by doing this
    val myInt : Long = 10//default is Int, but by adding Long it will be stored as Long
    // if at initial assigment a type is selected then you cannot change it later,
    //for floats and doubles
    // the default is double but can be over ridden by using f at the end just like in java
    var yash = Human("Yash", 19)
    //if we called the walk and the eat method in the init block then it will be executed as soon as the class is created
    //and no need to call it in the main method separately
   // yash.name and yash.age are properties of the class rather than just being the information. we can modify these properties
   // yash.age = 20 this line of code wont work because we have used val instead of var
    print(yash.name + " " + yash.age)//we cannot do this when name and age are just parameters
}