/***********************************
* Print the last letter of a string
* John Coleman
* 2015/10/01
* v1.0
************************************/

import java.util.Scanner;

public class LastLetter

{
		public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// Get Name
		System.out.print("What is your name: ");
		String name = in.next();
		
		// Find name length
		int x = name.length();
				
		// Print result
		System.out.println("The last letter in your name is " + name.substring(x-1));
		
	}
	
}