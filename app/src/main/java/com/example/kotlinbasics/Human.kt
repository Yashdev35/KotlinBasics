package com.example.kotlinbasics

class Human (val name : String , val age : Int) {
    //the constructors are very different here we can create a constructor for a class just like parameters in a function
    // in making the constructor, if the val or var keyword is used then it will be used as property,
    // if not then it will be used as a parameter
    //the thing about parameters is that they are just information passed down to the class and not stored in the class, or part of
    //the class, but properties are stored in the class and are part of the class, just like if we create a parameter for dog class
    //named color then it will just be an information but if we create a property color then it will become a property of the dog class
    init {
        //init is used to initialize the class, the moment the class is created the init block is executed
        walk(name)
        eat(name)
    }
    fun walk(namee: String) {
        println("I am $namee walking")
    }
    fun eat(namez: String) {
        println("I am $namez eating")
    }

}
fun main(){
    var yash = Human("Yash", 19)
    //if we called the walk and the eat method in the init block then it will be executed as soon as the class is created
    //and no need to call it in the main method separately
    // yash.name and yash.age are properties of the class rather than just being the information. we can modify these properties
    // yash.age = 20 this line of code wont work because we have used val instead of var
    print(yash.name + " " + yash.age)//we cannot do this when name and age are just parameters
}
// in kotlin constructors work very differently than in java
//in java constructor are created by using the class name and then the constructor name, but here we have constructor keyword
//data classes in kotlin are like abstract classes in java, they are used to store data and are not used to create objects

