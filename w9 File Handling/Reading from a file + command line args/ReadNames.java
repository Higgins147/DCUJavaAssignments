import java.io.*;
import java.util.Scanner;

public class ReadNames
{
    public static void main(String [] args)
    {
        Scanner s = null;
		Scanner in = new Scanner(System.in);
		
		try
		{
		    s = new Scanner (new BufferedReader(new FileReader(args[0])));
			int word = Integer.parseInt(s.next());
			int stop = word;
			String [] array = new String[word]; 
			
			while(s.hasNext())
			{
				array[word - 1] = s.next();
				word--;
			}
			
			System.out.println("The names in reverse order are:");
            
            word = 0;
            
			while(word != stop)
			{
				System.out.println(array[word]);
				word++;
			}
		}
		catch(Exception e)
		{
			System.out.println("Usage: java ReadNames <filename>");
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