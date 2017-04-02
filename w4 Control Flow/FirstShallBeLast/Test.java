import java.util.Scanner;

public class Test

{
	public static String firstShallBeLast(String word)	{
	
		int i = word.length();
		String a = word.substring(0,1);
		String b = word.substring(1,i-1);
		String c = word.substring(i-1);
	
		return c + b + a;
	}
}