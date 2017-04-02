/******************************
*  John Coleman
*  Sum two numbers
*  29/09/2015
*  v1.0
*
*******************************/

import java.util.Scanner;

public class SumIt
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.println("Enter two numbers: ");
        
        // Read in the numbers
        int num1 = in.nextInt();
		int num2 = in.nextInt();
        
        // do the necessary (calculate the result) (Create a variable to hold the result - what type should the variable be?)
        int result = (num1 + num2);
        
        // prepare the user for the result
		System.out.print(num1 + " and " + num2 + " is ");
        
		// print out the result
        System.out.println(result);
        
    }
}