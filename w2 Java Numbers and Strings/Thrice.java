/*************************
*  John Coleman
*  Repeat Thrice
*  29/09/2015
*  v1.0
*
**************************/

import java.util.Scanner;

public class Thrice
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.println("Enter three numbers: ");
        
        // Read in the numbers
        int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		

        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        int result = num1 * num2 * num3;

        // prepare the user for the result
		System.out.print("The product is ");
		
        // print out the result (use System.out.println() )
        System.out.println(result);

    }
}