import java.util.Scanner;

public class Q1

{
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = in.next();
		
		int nameLength = name.length();
		
		if (nameLength <= 3)
			System.out.println("Your name is short");
		if (nameLength >= 8)
			System.out.println("Your name is long");
		else
			System.out.println("Your name is average");
	}
}