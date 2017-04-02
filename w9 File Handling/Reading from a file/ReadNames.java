import java.io.*;
import java.util.Scanner;

public class ReadNames
{
    public static void main(String [] args) throws IOException
    {
        Scanner in = new Scanner(System.in);
        Scanner s = null;
		
		try
		{
		    System.out.print("Enter the file name: ");
		    String fileName = in.next();
		    s = new Scanner (new BufferedReader(new FileReader(fileName)));
			int word = Integer.parseInt(s.nextLine());
			
			System.out.println("The names in reverse order are:");
			
			int stop = word;
			String [] array = new String[word]; 
			
			while(s.hasNext())
			{
				array[word - 1] = s.nextLine();
				word--;
			}
			
			word = 0;
			
			while(word != stop)
			{
				System.out.print(array[word] + " ");
				word++;
			}
		}
		finally
		{
			if(s != null)
			{
				s.close();
			}
		}
    }
}