public class TotalArgs
{
    public static void main(String [] args)
    {
        int total = 0;
        int num = 0;
		for(int i = 0; i < args.length; i++)
		{
			num = Integer.parseInt(args[i]);
			total = total + num;
		}
		System.out.println("The sum is " + total + ".");	
    }
}