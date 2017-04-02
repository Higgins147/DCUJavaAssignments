/*
    This code is supplied and may be used to solve this problem.
    
    Note that the output matching is exact (down to spaces and newlines)
    It will be very difficult to get this correct if you do not use the supplied 
    System.out.print statements
*/
import java.util.Scanner;

public class StringReproduction
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer and a string: ");
        // Read in the string
        int position = in.nextInt();
        String word = in.next(); 
        int i;
        for(i = position; i > 0; i = i - 1)
        
        System.out.print(word);
        System.out.println();
    }
}