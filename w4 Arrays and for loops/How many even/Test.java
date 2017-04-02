public class Test

{
	public static int countEven(int [] even)
	
	{
	int total = 0;
		for (int i = 0; i < even.length; i++)
		{
			if((even[i] % 2) == 0)
			total = total +1;
		}
		return total;
	}
}