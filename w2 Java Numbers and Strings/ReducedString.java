/***********************************
*  Remove a character from a string
*  John Coleman
*  2015/10/01
*  v1.0
* 
************************************/

import java.util.Scanner;

public class ReducedString
{
    public static void main(String[] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer and a string: ");
        
		// Read in the string
        int position = in.nextInt();
        String word = in.next();

        // work out what to print
        int lengthWord = word.length();
		
        System.out.print(word.substring(0,position-1));
		System.out.print(word.substring(position,lengthWord));
    }
}