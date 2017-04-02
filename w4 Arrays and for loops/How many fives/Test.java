public class Test

{
	public static int countFives(int [] five)
	
	{
	int total = 0;
		for (int i = 0; i < five.length; i++)
		{
			if(five[i] == 5)
			total = total +1;
		}
		return total;
	}
}