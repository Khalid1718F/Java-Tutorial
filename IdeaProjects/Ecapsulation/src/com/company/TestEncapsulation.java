/*
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
To achieve this, you must:
declare class variables/attributes as private
provide public get and set methods to access and update the value of a private variable.
We know private variables can only be accessed within the same class (an outside class has no access to it).
However, it is possible to access them if we provide public get and set methods.
The get method returns the variable value, and the set method sets the value.
Syntax for both is that they start with either get or set,
followed by the name of the variable, with the first letter in upper case.
Encapsulation has the following advantages:
Better control of class attributes and methods,
Class attributes can be made read-only (if you only use the get method),
or write-only (if you only use the set method),
Flexible: the programmer can change one part of the code without affecting other parts,
Increased data security.
 */

package com.company;

public class TestEncapsulation
{
    public static void main(String[] args)
    {
	//Creating an object for the Encapsulation class so that it has access to the set and get methods of that class.
    Encapsulation customerObject = new Encapsulation();

    //Setting values of the variables using the above object which contains the set methods from the Encapsulation class.
    customerObject.setName("John Doe");
    customerObject.setAge(25);

    //Getting and displaying the values of the private variables in the Encapsulation method using,
    //the customerObject that we create and the "." operator to access the get methods of that class.
        System.out.println("The customers name is " + customerObject.getName());
        System.out.println("The customers age is " + customerObject.getAge());
    }
}
