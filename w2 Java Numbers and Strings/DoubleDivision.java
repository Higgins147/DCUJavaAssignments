/*************************
*  John Coleman
*  Double Division
*  29/09/2015
*  v1.0
*
**************************/

import java.util.Scanner;

public class DoubleDivision
{
    public static void main(String [] args)
	{
		// Create a scanner object
        Scanner in = new Scanner(System.in);		
		
		// Request the user to enter numbers
		System.out.println("Please enter two floating point numbers: ");
		
		// Calculate a divided by by
		Float a = in.nextFloat();
		Float b = in.nextFloat();
		Float result = a / b;
		
		// Print result
		System.out.println(a + " / " + b + " is " + result);
	}	
}