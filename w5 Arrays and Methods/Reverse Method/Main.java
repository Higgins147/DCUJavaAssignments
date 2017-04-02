public class Main
{
public static void main(String [] args)
	{
	int [] num = {2, 3, 5, 7, 11, 13, 17};
	
	// Call the method to reverse the array
	Test.reverse(num);
	
	for (int n: num)	
	System.out.print(n + " ");
	}
}