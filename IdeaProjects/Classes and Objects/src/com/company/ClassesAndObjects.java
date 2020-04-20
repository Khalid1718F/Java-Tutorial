/*
This program will demonstrate how to use classes and objects in java.
So, a class is a template for objects, and an object is an instance of a class.
An example of a class would be fruit.
An example of objects of that class would be apple, banana, Mango.
In other words a class is like an object constructor or a blueprint to create objects.
Another example of an object is a car.
The car has attributes, such as weight and color, and methods, such as drive and brake.
When the individual objects are created,
they inherit all the variables and methods from the class.
 */
package com.company;

public class ClassesAndObjects {
    //Here in our class we create a variable of type double and assign it a value.
    double x = 2.5;

    public static void main(String[] args) {
	//Here we create an object of the above class "Main" by first declaring the class name.
    //Then we assign the object to a new Main class with parenthesis and a semicolon.
    ClassesAndObjects myObject = new ClassesAndObjects();
    //Now we print the value of our double x using our object followed by a "." inside the print method.
    //Our double variable declared above is considered a field of our object.
        System.out.println(myObject.x);

    //Here we must create a new object from "OtherClass".
    //Once we have created this new object we can use it to access data from our other class.
    OtherClass otherObject = new OtherClass();
    //Now we can print out the variables in our other class using our new object.
    //The attributes of the other class are y and z they are accessed using the "." operator.
        System.out.println(otherObject.y + " " + otherObject.z);

    }
}
