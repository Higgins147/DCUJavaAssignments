/***********************************
*  Return the absolute value of a number again
*  John Coleman
*  2015/10/01
*  v1.0
* 
************************************/

import java.util.Scanner;

public class Absolute2

{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// Read in a number
		System.out.print("Enter a number: ");
		int num1 = in.nextInt();
		
		//Check if it's negative
		if (num1 <= 0)
			{
			System.out.println("The absolute value of: " + num1 + " is " + (num1 * -1));
			}
		else
			System.out.println("The absolute value of: " + num1 + " is " + (num1));

	}
}