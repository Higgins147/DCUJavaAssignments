import java.util.Scanner;

public class Q1
{
	public static void main(String [] args)
	{
        Scanner in = new Scanner(System.in);
        
		int [] num = new int[6];
		
		for(int j = 0; j < 6; j++)
		num[j] = in.nextInt();
		
		int best1 = num[0];
		int best2 = num[1];
		int temp;

		for(int i = 2; i < num.length; i++) 
		{
		if(num[i] > best2)
				best2 = num[i];
		if(best1 < best2)
			{
			temp = best1;
			best1 = best2;
			best2 = temp;
			}
		}
		//System.out.println("The two best marks are " + best1 + " and " + best2 + ".");
		System.out.println(best1 + " " + best2);
	}
}