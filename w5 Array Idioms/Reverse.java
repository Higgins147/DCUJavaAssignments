import java.util.Scanner;

public class Reverse
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
		System.out.print("How many numbers: ");
		int amount = in.nextInt();
		
		int [] numbers = new int [amount];
		
		System.out.print("Enter " + amount + " numbers: ");
		
		for(int i = 0; i < numbers.length; i++)
			numbers[i] = in.nextInt();
		
		System.out.print("The numbers reversed are: ");
		
		while(amount > 1)
		{
		amount--;
		System.out.print(numbers[amount] + " ");
		}
		
		System.out.println(numbers[0]);
    }
}