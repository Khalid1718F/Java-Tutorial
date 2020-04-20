/*
In this program we will demonstrate how to use methods declared in a class to perform certain actions.
You will often see Java programs that have either static or public attributes and methods.
A static method can be accessed without creating an object of the class.
Public on the other hand can only be accessed by objects.
 */

package com.company;

public class ClassMethods {

    //This is a static method with a void return value.
    static void myStaticMethod()
    {
        System.out.println("A static method can be called without creating objects.");
    }

    //This is a public method with a void return value.
    public void myPublicMethod()
    {
        System.out.println("A public method must be called by creating objects.");
    }

    //Here in our main method we call our static method and call the public method on our object.
    public static void main(String[] args)
    {
	    myStaticMethod();
	    ClassMethods myObject = new ClassMethods();
	    myObject.myPublicMethod();

	    //Here we will create an object of the PenClass and access the methods of that object from the other class.
        PenClass pen = new PenClass();
        pen.penTypeMethod();
        pen.penColor("Blue");
    }


}
