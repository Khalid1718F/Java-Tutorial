//In the class we will demonstrate how to access methods with an object from another class.

package com.company;

public class PenClass {
    public void penTypeMethod()
    {
        System.out.println("I have a fountain pen!");
    }

    public void penColor(String color)
    {
        System.out.println("I have a " + color + " colored pen.");
    }
}

