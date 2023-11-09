package com.example.kotlinbasics
// in kotlin constructors work very differently than in java
//in java constructor are created by using the class name and then the constructor name, but here we have constructor keyword
//data classes in kotlin are like abstract classes in java, they are used to store data and are not used to create objects
data class CoffeeDetails(val name : String,
    val sugar : Int,
                         val milk : Boolean,
                         val size : String,
                         val price : Int)
fun main() {
    var yorn = 'y'

    do {
        println("do you want coffee ?")
        val yash = CoffeeDetails("yash", 2, true, "large", 20)
        var permission = readLine().toString().lowercase()
        if (permission == "yes") {
            println("your name ?, sir")
            var name = readLine().toString()
            println("sugar ?")
            var sugar = readln().toInt()
            println("name ?")
            makeCoffee(yash)//by using the object we can pass the object as a parameter, and then use the properties of the object
        } else {
            println("you didnt say yes")
        }

        println("do you want another coffee ?")
        yorn = readln().toCharArray()[0].lowercaseChar()
        if (yorn != 'y') {
            println("ok sir")
        }

    }while (yorn == 'y')

}
//in kotlin we use(( variable name : its type ) to use as parameter
//we can pass objects as parameters too
fun makeCoffee(coffeeDetails: CoffeeDetails) {
    if (coffeeDetails.sugar == 0) {
        println("Coffee without sugar for ${coffeeDetails.name} is ready")
    } else if (coffeeDetails.sugar == 1) {
        println("Coffee with one spoon sugar for ${coffeeDetails.name} is ready")

    } else if (coffeeDetails.sugar >= 2) {
        println("Coffee with $coffeeDetails.sugart spoons sugar for ${coffeeDetails.name} is ready")
    } else {
        println("${coffeeDetails.name} sir there is no such thing as negative sugar")
    }

}