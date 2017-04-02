import java.util.Scanner;
public class DoubleX
{
    public static boolean doubleX(String word)	{
		int total = word.length();
		String letter1, letter2;
     	for(int i = 0; i <= total -2; i = i + 1) {
			letter1 = word.substring(i, i + 1);
			letter2 = word.substring(i + 1, i + 2);
			
			if (letter1.equals("x")) {
				
				if (letter2.equals("x")) {
					return true;
				}
				else {
					return false;
				}
			}
		}
		return false;
	}
}