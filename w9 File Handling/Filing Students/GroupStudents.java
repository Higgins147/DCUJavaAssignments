import java.io.*;
import java.util.Scanner;

public class GroupStudents
{
   public static void main(String [] args)
   {
       	Scanner s = null;
		Student [] group;		
		try
		{
		    s = new Scanner (new BufferedReader(new FileReader(args[0])));
			int arrayLength = Integer.parseInt(s.next());
			
			group = new Student[arrayLength]; 
			
		
			for(int i = 0; i < arrayLength; i++)
			{
				group[i] = new Student(s.next(), Integer.parseInt(s.next()));
			}
			
			Student.print(group);
		}
		catch(IOException e)
		{
			System.out.println("File not Found" + e.getMessage());
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