/***********************************
*  Tell if number is Odd or Even
*  John Coleman
*  2015/10/01
*  v1.0
* 
************************************/

import java.util.Scanner;

public class EvenOdd

{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// Read in a whole number
		System.out.print("Eneter a number: ");
		int num1 = in.nextInt();
		
		if ((num1 % 2) > 0)
			System.out.println(num1 + " is odd");
		else
			System.out.println(num1 + " is even ");
	}
}