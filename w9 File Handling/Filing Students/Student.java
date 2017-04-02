public class Student
{
   String name;
   int mark;

   public Student(String n, int m)
   {
      name = n;
      mark = m;
   }
   
   public static void print(Student [] s)
   {
		for(int i = 0; i < s.length; i++)
		System.out.println(s[i].name);
   }
}