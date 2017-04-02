/*************************
*  John Coleman
*  Repeat Two Times
*  29/09/2015
*  v1.0
*
**************************/

import java.util.Scanner;

public class TwoTimes
{
	public static void main(String [] args)
	{
	
	// Ask the user to enter a number
	Scanner in = new Scanner(System.in);
	
	// Ask the user to print a number
	System.out.println("Enter a number: ");
	
	//Read in the number
	int num = in.nextInt();
	
	// Calcualte the result
	int result = num * 2;
	
	// Prepare the user for the result
	System.out.print("Times two is: ");
	// Print the result
	System.out.println(result);
		
	}
}