/******************************
* Tell the length of a string
* John Coleman
* 2015/10/01
* v1.0
*******************************/

import java.util.Scanner;

public class LengthOfName
{
    // Fill in the main method
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        
        // Use the length() method of the String class.
		System.out.print("Hello " + name + ", your name has " + name.length() + " letters.");
	}
}