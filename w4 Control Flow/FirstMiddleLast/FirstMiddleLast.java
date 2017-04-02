import java.util.Scanner;

public class FirstMiddleLast
{
    
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter a word: ");
    String word = in.next();
    
    int wordLength = word.length();
    int i = wordLength;
    
    String first = word.substring(0, 1);
    String middle = word.substring(1, i - 1);
    String last = word.substring(i - 1);
    
    System.out.println(first);
    System.out.println(middle);
    System.out.println(last);
    
    }
}