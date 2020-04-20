/*In this program we will demonstrate how to use methods.
  The "static" keyword that is found in our methods below means that the methods belong to the "Methods" method.
  It is important to note that the static keyword distinguishes each method from an object of the class.
  It shows that these are methods of the class "Methods" and not objects of that class.
 */

package com.company;


public class Methods
{

    public static void main(String[] args)
    {
    //Here we call our multiply method and pass it two values namely a and b.
	multiply(10, 20);

	//Here we call our divide method and pass it two values namely c and d.
    divide(20, 10);

    //Here we create a new int variable called sum and assign the method add to it with two values.
    //The add method will take in the two values shown below and apply them in our add method below.
    //Then it will "return" an int value and store that value in the variable sum.
    int sum = add(10, 20);
    //Now we will print out the result of our new variable.
    System.out.println(sum);

    //Here we declare a variable of type String called message and assign to stringMethod.
    //The stringMethod will take the argument inside the parenthesis and convert the characters to capital.
    //The new capitalized String will "return" and be assigned to our message variable.
    String message = stringMethod("We are learning how to use Methods!");
    //Now we will print out the result of our message variable.
        System.out.println(message);

    //Declaring a variable of type integer array called myArray.
    //Setting that variable equal to the array method and passing it two values.
    //Each value gets assigned to its respective index and gets evaluated by our method.
    //Our method takes the two index values and stores them in the array variable.
    int[] myArray = arrayMethod(5, 6);
    //Printing out the first and second value by index using the "myArray" variable that was made above.
        System.out.println(myArray[0] + " " + myArray[1]);

    }

    //This is void method that we will use to multiply two
    //integer values that are being passed as parameters called a and b.
    //This method is similar in structure to our main method.
    public static void multiply(int a, int b)
    {
        System.out.println(a * b);
    }

    public static void divide(int c, int d)
    {
        System.out.println(c / d);
    }

    //Here we will use the return keyword to implement our method.
    //We will create a method called add and will pass it two parameters int e and int f.
    //The return type of this method will be int.
    public static int add(int e, int f)
    {
        return e + f;
    }

    //This method will take in a String parameter and it return type will also be String.
    //The return value of this String will be a string named s converted to uppercase using the toUpperCase method.
    public static String stringMethod(String s)
    {
        return s.toUpperCase();
    }

    //This method will take in two integers as its parameters.
    //The return type of this method will be an array of integers.
    public static int[] arrayMethod(int g, int h)
    {
        //Creating a variable of type integer arrays and setting it equal to a new int array of size 2.
        int[] array = new int[2];
        //Setting the two indices of the array equal our parameters g and f.
        array[0] = g;
        array[1] = h;
        return array;
    }
}
