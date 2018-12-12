//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package matrices;
import java.util.*;
import java.io.*; 

public class MatrixSumming2
{
    private int[][] m = {{1, 2, 3, 4, 5},
    					{6, 7, 8, 9, 0},
    					{6 , 7, 1, 2, 5},
    					{6 ,7 ,8 ,9 ,0},
    					{5, 4, 3, 2, 1}};  //load in the matrix values
    private int total;
    public int sum( int r, int c )
    {
        	 int total = 0;
      	   for(int row = r-1; row <r+1; r++) //r-l c-l
      	    for(int col = c-1; col < c+1; c++)
      	    	if(row>-1 && col>-1 && row<r && col<c){ // boundary conditions
      	          if(row!=r && col!=c){
      	       total += m[row][col];
        }   	 
      	    	}
		return total;
        }
    	
            
    public String toString()
        {
        	return "" +total;
        }
    }

