package com.example.kotlinbasics.InheritanceDemo

class Child : Base() {
    //to inherit a class we use : and then the name of the class
    //now we can access the coreValues() function of the base class
  override fun coreValues() {
        super.coreValues()//using super keyword we can also include what ever the code was written in the base class, if we
      // dont include the super keyword then the code of the base class will not be executed and only overridden code will be executed
        println("Core values of child class, if the super keyword is not used then only this line will be printed")
    }

}