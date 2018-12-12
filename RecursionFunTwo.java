package recursion;
import static java.lang.System.*;

public class RecursionFunTwo
{
	public static int countChickens(String word)
	{
		if (!word.contains("chicken"))
			return 0;
		else if (word.contains("chicken"))
			return 1 + countChickens(word.replaceFirst("chicken", ""));
		else 
			return 0 + countChickens(word.replaceFirst("chicken", ""));
			
	}
}