public class Test

{
public static void reverse(int [] num)
	{
	int check = num.length;
	int [] tempArray = new int [check];
	int x = check - 1;
	
	for(int i = 0; i < check; i++)
		{
		tempArray[x] = num [i]; 
		x--;
		}

	for(int i = 0; i < check; i++)	
		num[i] = tempArray[i];
	
	}
}

/*
Charlies method.....
for(int i = 0; i < num.length; i++)
newA[i = num(num.length - 1 - i)];
*/


