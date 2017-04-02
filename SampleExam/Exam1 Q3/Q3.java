import java.util.Scanner;

public class Q3

{
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter prices of the four items: ");
		int price1 = in.nextInt();
		int price2 = in.nextInt();
		int price3 = in.nextInt();
		int price4 = in.nextInt();

		int cheapest = price1; 
		int dearest = price1;
		
		if (price2 <= price1)
			cheapest = price2;
		if (price3 <= cheapest)
			cheapest = price3;
		if (price4 <= cheapest)
			cheapest = price4;
		
		if (price2 >= dearest)
			dearest = price2;
		if (price3 >= dearest)
			dearest = price3;
		if (price4 >= dearest)
			dearest = price4;
		
		int difference = dearest - cheapest;
		
		System.out.println("the difference in prices is " + difference + "c");
	}
}