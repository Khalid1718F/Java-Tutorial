/*
This program demonstrates how to use the final keyword for variables methods and classes.
The final keyword indicates that whatever variable, method, or class we use it in will not change.
When using the final keyword for a method the attributes and methods cannot be changed.
 */

package com.company;

public class FinalKeyword
{
    //We place our variables here as they are global variables.
    //We use the keyword "final" to let java know they will not change.
    //It is good practice to have final variables capitalized so as not to confuse them.
    final float PI = 3.14F;


    public static void main(String[] args)
    {
	//If I want to print out the value of my final global variable above I would have to create an object.
    //I need to create an object so that i can have access to all of the attributes and methods in this class.
    //Once I have created this object i can now access the final variable/attribute above.
    FinalKeyword finalObject = new FinalKeyword();
    //Now i can print the value of the object above.
        System.out.println(finalObject.PI);

    }
}
