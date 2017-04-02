/*
    This code is supplied and may be used to solve this problem.
*/
import java.util.Scanner;

public class OnlyHigh
{
    public static void main(String [] args)
    {
        // Create a scanner object
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        // Read in the word
        String word = in.next();

        int total = 0;
        int wordLength = word.length()-2;
        String y = "hi";
        String x = "";
        for(int i = 0; i <= wordLength; i = i + 1)
           { 
            x = word.substring(i, i + 2);
            if(x.equals(y))
                System.out.println(y);
           }
    }
}