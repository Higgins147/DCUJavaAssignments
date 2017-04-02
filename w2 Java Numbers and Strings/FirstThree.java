/******************************
* Print first 3 letters of string
* John Coleman
* 2015/10/01
* v1.0
*******************************/

import java.util.Scanner;

public class FirstThree

{
		public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// Get Name
		System.out.print("Tell me your name: ");
		String name = in.next();
		
		// Print result
		System.out.println("Your nickname is " + name.substring(0,3));
	}
		
}