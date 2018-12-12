package matrices;
import java.util.*;
import java.io.*; 

//ADDS UP ALL THE VALUE IN AN ARRAY AND PRINTS THE ARRAY OUT FIRST 
public class MatrixSumming1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int sum(  )
    {
    	int count=0;
    	System.out.println("matrix values");
    	for(int row=0; row<m.length;row++)
    	{
    		for(int col=0; col<m.length; col++){
    			count += m[row][col];
    			System.out.print(" " + m[row][col]+ " ");
    		}
    		System.out.println("");
    	}
		return count;
    }
}
