import java.io.*;
import java.util.Scanner;

public class WriteStudents
{
   public static void main(String [] args)
   {
       	Scanner input = null;
		BufferedWriter output = null;
		String copy;
		int stop;
		int i = 0;
		
		try
		{
		    input = new Scanner (new BufferedReader(new FileReader(args[0])));
			output = new BufferedWriter(new FileWriter(args[1]));
			
			stop = Integer.parseInt(input.next());
			output.write(Integer.toString(stop) + "\r\n");
						
			while(i < stop)
			{
				output.write(input.next() + " ");
				output.write(Integer.toString((Integer.parseInt(input.next()) + 1)));
				output.write("\r\n");
				i++;
			}
			
			output.close();
			
		}
		catch(IOException e)
		{
			System.out.println("File not Found" + e.getMessage());
		}
		/*
		finally
		{
			if(input != null)
			{
				input.close();
			}
			if(output != null)
			{
				output.close();
			}
		}
		*/
   }
}