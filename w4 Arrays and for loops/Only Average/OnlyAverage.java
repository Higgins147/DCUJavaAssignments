import java.util.Scanner;

public class OnlyAverage
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int num = in.nextInt();
        
        System.out.print("Enter " + num + " numbers: ");

		float sum = 0;
		
        for (int i = 0; i < num; i++){
			float numf = in.nextFloat();
			sum = sum + numf;
			}
		    
        System.out.println("The average is " + sum / num);
    }
}