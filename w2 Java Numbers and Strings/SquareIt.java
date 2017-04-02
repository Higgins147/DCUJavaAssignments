/*************************
*  John Coleman
*  Square It
*  29/09/2015
*  v1.0
*
**************************/

import java.util.Scanner;

public class SquareIt
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		
		// Ask the user to enter a number
		System.out.println("Enter a number: ");
		
		int num = in.nextInt();
		
		// Calcualte the result
		int result = num * num;
		
		// Prepare user for the result
		System.out.print("Result is: ");
		
		// Print result
		System.out.println(result);
		
	}

}