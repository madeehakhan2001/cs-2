package matrices;
public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		int [][]m= {{1,2,3},{5,5,5,5}};
		System.out.println(TotalRow.getRowTotals(m));
		//add code here			
		int[][] a = {{1,2,3}, {5,5,5,5}};
		System.out.println(TotalRow.getRowTotals(a));
		
		int[][] b = {{1,2,3}, {5}, {1}, {2,2}};
		System.out.println(TotalRow.getRowTotals(b));
		
		int[][] c = {{1,2}, {5,5}, {5,5}, {4,5,6,7}, {123124,12312}};
		System.out.println(TotalRow.getRowTotals(c));
	}
}



