/*************************
*  John Coleman
*  centigrade to fahrenheit
*  29/09/2015
*  v1.0
*
**************************/

import java.util.Scanner;

public class Cent2Fahr
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
	
		// Enter the temp in degrees centigrade
		System.out.print("Enter the temperature in degrees centigrade:");
		int centigrade = in.nextInt();
		
		// Calculate the result
		float result = (centigrade * 9f / 5f) + 32f;

		// Print the result
		System.out.println("The temperature in degrees Fahrenheit is " + result);
	
	}
}