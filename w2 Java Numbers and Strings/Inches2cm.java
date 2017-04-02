/*************************
*  John Coleman
*  Inches to cm
*  29/09/2015
*  v1.0
*
**************************/

import java.util.Scanner;

public class Inches2cm
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        // Find out how many inches
		System.out.println("Please enter a quanity in inches: ");
		int inches = in.nextInt();

		// Calculate the value
		double cm = inches * 2.54;
		
        // Print out the result
		System.out.println(inches + " inch is " + cm + "cm");
    }
}