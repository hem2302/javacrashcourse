package com.polymorphism.learning;

//What is polymorphism
//Ans: Polymorphism is many. Its a capabality of the methods to do the different 
//things based on the object that it is acting upon.

//Types of polymorphism
//1. Compilet-time/static/Early binding/overloading
//2. Run-Time/Dynamic binding/LateBinding/Overriding

//***Overloading***
//Overloading will happen only in the same class.
//Overloading method names should be same. but there should be any difference with the paramameter/arguments
//No restrictions with the access modifiers. any access modifiers can bbe for the overloading methods.
//No restrictions with the return types. Any return type can be there between the overloading methods.
//No restrictions with the throws exception
//No restrictions with the private #
//Static methods can be overloaded

//***Overriding***
//Overriding happens only in the inheritance within the parent and sub class.#
//Method name and return should be SAME
//child class throws exception should be equal or greater than the parent class throws exception4
//Child class method access modifier should be same or greater than the parent class
// child class return type should be same or should be covariant of the parent class
//Private method cannot be overriding because private method is only within the class and cannot be inherited.

//******Static methods CANNOT BE OVERRIDDEN. 
//static is common for the class. ie. class level. class method non static will be only specific to the object created.
//If both the parent and child class methods declared as static. and method is called, then only the child class method content will be displayed.
//At the same time, it is not considered as overridden and the parent class method will be hidden. this is called method hiding.**********

