/*This program will demonstrate how to use 2D arrays.
 */

package com.company;

public class TwoDimensionalArrays {

    public static void main(String[] args) {
	//First we create a variable of type int with two sets of square brackets to indicate that it is a 2D array.
    //The first set of brackets represents a row and the second set represents a column.
    //We set our 2D array variable equal to a new int and indicate the size of the array.
    int[][] twoDimArray = new int[2][2];
    //Now we assign values to each index position inside our 2D integer array.
    twoDimArray[0][0] = 1;
    twoDimArray[0][1] = 2;
    twoDimArray[1][0] = 3;
    twoDimArray[1][1] = 4;
    //Now we print out the values of the desired element in the array using its index position.
        System.out.println(twoDimArray[1][0]);

    //Now we will do the same thing that we did above except this time we will use a 2D array list.
    //This time we will declare a 2D array of type String and add values to the array list using curly braces.
    //First we declare a 2d array String type variable and assign the values separated by rows and columns.
    String[][] stringArray = {{"First", "Second", "Third"}, //[0][0] [0][1] [0][2]
            {"Fourth", "Fifth", "Sixth"}};//[1][0] [1][1] [1][2]
    //Now we will print out different items from our 2D array list based on the index position.
        System.out.println(stringArray[0][1] + " " + stringArray[1][1] + " " + stringArray[1][2]);

    }
}
