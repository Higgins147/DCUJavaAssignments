import java.util.Scanner;

public class Teen
{
	public static boolean oneTeen(int num1, int num2)	{
	
	boolean teenager1 = (num1>12 && num1<20);
	boolean teenager2 = (num2>12 && num2<20);
	
	if(teenager1 != teenager2)
		return true;
	else
		return false;
	}
}