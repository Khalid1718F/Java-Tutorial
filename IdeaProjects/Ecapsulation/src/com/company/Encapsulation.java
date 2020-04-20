package com.company;

public class Encapsulation
{
    //Here we declare private variables that can only be accessed by public methods of this class.
    private String customerName;
    private int customerAge;

    //We create a public get method to access the private variable customerName. Returns customers age.
    public String getName()
    {
        return customerName;
    }

    //We create another get method to access the private variable customerAge. Returns customers age.
    public int getAge()
    {
        return customerAge;
    }

    //A set method takes the parameter of the variable newName and assigns it to the private variable customerName.
    public void setName(String newName)
    {
        customerName = newName;
    }

    //A set method takes the parameter of the variable newAge and assigns it to the private variable customerAge.
    public void setAge(int newAge)
    {
        customerAge = newAge;
    }
}
