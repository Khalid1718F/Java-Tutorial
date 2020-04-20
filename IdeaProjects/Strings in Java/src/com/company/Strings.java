/*
This program will demo how to use strings and their various methods in java.
Java has a String class. This class allows one to declare
variables of data type String and provides methods (or member
functions) for manipulating strings. The contents of String objects
are immutable (i.e., they can not be changed).
This program will also demo how to use the Scanner class to create a scanner object
which will read in different input from the keyboard given by the user.
String object values can not be compared by using the standard
relational operators. You must use a String method.
Strings are compared character by character according to their
ASCII codes. Two Strings are equal if and only if they have the
exact same number of characters and match position by
position.
 */

package com.company;

import java.util.Scanner;

public class Strings
{

    public static void main(String[] args)
    {
        //We declare a string object by using the keyword String,
        //then assigning it a value that is enclosed in double quotes.
        String myString1 = "I am learning how to use strings!";
        String myString2 = "Strings are enclosed in double quotes.";
        //Now we print  out the value stores in our string variables.
        //We do this by concatenating the two strings with a white space in between.
        System.out.println(myString1 + " " + myString2);
        //We can also achieve this by creating a third string variable called myString3.
        //This variable will be assigned myString1 followed b the '+' operator
        //and a pair of double quotes with a space in between and finally another '+'
        //operator to concatenate myString2 with myString1 and the space in between.
        String myString3 = myString1 + " " + myString2;
        //Now we print the result of the new variable myString3.
        System.out.println(myString3);

        //We can also concatenate single characters to string using the '+' operator.
        //We create a new String variable called myString4 and assign it a String value.
        String myString4 = "Apple";
        //Now we will change the string 'Apple' to 'Apples' with an s at the end using the
        //'+' operator. We set assign myString4 the value of myString4 plus the char s in single quotes.
        myString4 = myString4 + 's';
        //Now we print out our concatenated string.
        System.out.println(myString4);
        //We could also achieve this by writing it like this: myString4 += 's';

        //We can also use the concat() method of the string class to perform concatenation.
        //We declare a new string called myString5 and assign it to the myString2 variable.
        //We access the methods of the myString2 variable using the dot operator.
        //We use the concat() method and inside the parentheses we add the string we want.
        //Now myString5 will hold the value of the newly concatenated String.
        String myString5 = myString2.concat(" This is how to use the concat method of the string class.");
        //Now we print out the result of myString5.
        System.out.println(myString5);

        //We can assign values to a string variable.
        //The two variables below are reference variables that have not been initialized.
        String str1, str2;
        //Now we can assign string values to our reference variables using the assignment statement.
        str1 = "This is my first string reference variable.";
        str2 = "This is my second string reference variable";
        //When we assign 'str1' a new value it creates a new string object.
        str1 = "This assignment creates a new String object.";
        System.out.println(str1);

        //We create a Scanner class object to read in user input from the keyboard.
        Scanner keyboard = new Scanner(System.in);
        //str1 and str2 will now be assigned the keyboard Scanner class object.
        //The keyboard Scanner class object will access the nextLine() and next() methods.
        //These methods will enable the keyboard object to read in a string from the user.
        //After the input is read in it is assigned and stored in the str1 and str2 variables.
        str1 = keyboard.nextLine(); //Note: this will read in characters until an ENTER is encountered.
        str2 = keyboard.next(); //Note: this will read in characters until a whitespace is encountered.

        //The string class has a method that helps us find the number of characters contained in a string.
        //We use the '.' operator on a string variable to access the length() method.
        String city = "New York";
        String borough = "Brooklyn";
        //We declare two uninitialized int variables to hold the value of
        //the length of our city variable and number of characters of our borough variable.
        int citySize, numChars;
        //Now we take the two variables above and assign them
        //to our string variables combined with the length() method to store the size and number of chars.
        citySize = city.length();
        numChars = borough.length();
        //Now we print out the result of citySize and numChars variables.
        System.out.println(citySize + " " + numChars);

        //Since Strings cant be compared using traditional relational operators we must use
        //the equals() method of the String class. This method will return a boolean value.
        //We will use an if - else statement to demo how to use thw equals() method of the string class.
        if(city.equals(borough))
            System.out.println("They're the same.");
        else
            System.out.println("They're different.");

        //The compareTo() method compares two strings lexicographically.
        //The comparison is based on the Unicode value of each character in the strings.
        //he method returns 0 if the string is equal to the other string.
        //A value less than 0 is returned if the string is less than the other string (less characters)
        //and a value greater than 0 if the string is greater than the other string (more characters).
        //Here we will use if - else if statements to demo the compareTo() string method.
        if(city.compareTo(borough) < 0)
            System.out.println("city is less than borough.");
        else if(city.compareTo(borough) > 0)
            System.out.println("city is more than borough.");
        else if(city.compareTo(borough) == 0)
            System.out.println("city is equal to borough.");
        //Note: Use compareToIgnoreCase() to compare two strings
        //lexicographically, ignoring lower case and upper case differences.
        //Also the equals() method compares two strings without considering unicode values.








    }
}
