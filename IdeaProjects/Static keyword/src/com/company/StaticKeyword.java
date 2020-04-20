/*
This program will demo how to use the "static" keyword in java.
A global variable is created outside the scope of the main method.
A static method means that it can be accessed without creating an object of the class, unlike public:
In the methods program we demo how to use the static keyword in methods.
 */

package com.company;

public class StaticKeyword
{
    //Here we create and initialize a global variable.
    int global1 = 10;
    //We declare and initialize another global variable with the keyword static in front.
    static int global2 = 30;

    public static void main(String[] args)
    {
	    //Here we create and initialize a local variable.
        int local = 20;
        //If we try to print out the local variable it will work.
        //The global variable wont be printed because its beyond the scope of the method.
        System.out.println(local);
        //System.out.println(global1); We comment this line out because it will cause an error.
        //Now we try to print out our second global variable that has the keyword static attached to the front.
        System.out.println(global2);

        //If I wanted to print out the first global variable without
        //using the static keyword i would have to do the following.
        //First i would have to create an object from this class so it can access the attributes and methods
        //of the class. The attributes include the global variables on top.
        StaticKeyword globalObject = new StaticKeyword();
        //Now I can use the object above to print out the value of global1.
        //Since this is tedious a shortcut is to just use the static keyword.
        System.out.println(globalObject.global1);
    }
}
