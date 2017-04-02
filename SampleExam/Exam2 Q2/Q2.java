import java.util.Scanner;

public class Q2
{
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);

    System.out.print("Enter a string: ");
	String sentence = in.nextLine();
	
	int start = sentence.indexOf('{');
	int finish = sentence.indexOf('}');
	
	System.out.println("The tags are");
	
	while(start != -1)
		{
		String find = sentence.substring(start + 1, finish);
		System.out.println(find);
	
		sentence = sentence.substring(finish + 1);
			
		start = sentence.indexOf('{');
		finish = sentence.indexOf('}');
		}
	}
}