import java.util.Scanner;

public class SumNumbers

{
	
	public static void main (String[] args)	{
	
	Scanner in = new Scanner(System.in);
		
	System.out.print("Enter a number: ");
	int i = in.nextInt();
	int count = 0;
	int z = i;
	
		while(i > 0) {
			count = count + i;
			i--;
		}
	
	System.out.println("The sum of the number from 1 to " + z + " is " + count);
	
	}
}