public class Test
{
	public static double getPassingAverage(Student [] student)
	{
	    int count = 0;
		double total = 0;
		
		for(int i = 0; i < student.length; i++)
		{
			if(student[i].getMark() >= 40)
				{
					count++;
					total = total + student[i].getMark();
				}
		}
		return total/count;
	}
}