/*
A constructor in Java is a special method that is used to create/initialize objects.
The constructor is called when an object of a class is created.
It can be used to set initial values for object attributes.
Note that the constructor name must match the class name, and it cannot have a return type (like void).
Also note that the constructor is called when the object is created.
All classes have constructors by default: if you do not create a class constructor yourself,
Java creates one for you. However, then you are not able to set initial values for object attributes.
Constructors can also take parameters, which is used to initialize attributes.
You can have as many parameters as you want.
 */

package com.company;

//Create a class named ConstructorClass.
public class ConstructorClass
{
    //Create a class attribute of type String.
    String shirtMessage;
    //Create another class attribute of type int.
    int numberOfShirts;
    //Create another class attribute of type String.
    String shirtType;

    //Create a class constructor for ConstructorClass.
    //The following Constructor adds int number and String type as parameters.
    public ConstructorClass(String type, int number)
    {
        //Set an initial value to the String class attribute.
        shirtMessage = "I have made shirts using a constructor!";
        //We assign the parameters to our class attributes numberOfShirts and shirtType.
        numberOfShirts = number;
        shirtType = type;
    }
    public static void main(String[] args)
    {
	//Create an object of the class ConstructorClass which will call the constructor.
    //When we call the constructor we pass it two parameters for type and number.
    //The first parameter will pass the value of the type parameter to our shirtType attribute/variable.
    //The second parameter will pass the value of number to our numberOfShirts attribute/variable.
    ConstructorClass consObject = new ConstructorClass("I have made this many shirts", 20);
    //Printing out the value of the class attribute s using the the object created above.
        System.out.println(consObject.shirtMessage);
    //We will print out the newly stored values in our class attributes/variables.
    //Those attributes/variables will be accessed using the consObject that we created above.
        System.out.println(consObject.shirtType + " " + consObject.numberOfShirts);

    }
}
