package recursion;
import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
	/*	if (num <= 0)
			return 0;
		else if ((num%10)/2.0 != 0)
			return 1 + countOddDigits(num/10);
		else 
			return 0 + countOddDigits(num/10);
		*/
		if (num <= 0)
			return 0;
		else if ((num%2)/2.0 == 0)
			return 1 + countOddDigits(num/10);
		else 
			return 0 + countOddDigits(num/10);
	}
}