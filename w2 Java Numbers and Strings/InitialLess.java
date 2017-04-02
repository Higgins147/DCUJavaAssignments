/***********************************
* Print all but the first letter of a string
* John Coleman
* 2015/10/01
* v1.0
************************************/

import java.util.Scanner;

public class InitialLess

{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// Ask for a name
		System.out.print("Tell me your name: ");
		String name = in.next();
		
		// Get length of name
		int nameLength = name.length();
		
		// Print all but the first initial
		System.out.println("Initial less, your name is " + name.substring(1,nameLength));
		
			
	}
	
	
	
}