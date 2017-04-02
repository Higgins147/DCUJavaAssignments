import java.util.Scanner;

public class Q2

{
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("How many seconds: ");
		int seconds = in.nextInt();
		
		while (seconds >= 0){
			System.out.println(seconds);
			seconds = seconds - 1;
			}
		
			System.out.println("We have lift off!");
	}
}