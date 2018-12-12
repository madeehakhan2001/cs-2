//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package matrices;
import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {

    	int count = 0;
    	List<Integer> RowTotals = new ArrayList<Integer>();
    	
    	for ( int row[] : m)
    	{
    		for ( int col : row)
    			count += col;
    		RowTotals.add(count);
    		count = 0;
    	}
    	
		return RowTotals;
		
}
    }
