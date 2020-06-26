package Nick_White4;

import java.util.ArrayList;
import java.util.List;

public class Leet72 
{
	public static void main(String[] args)
	{
    int arr[][] = {{1,3,5,7},
    				{10,11,16,20},
    				{23,30,34,50}};
    
    System.out.println(searchmatrix(arr, 50));
    }
	
	// int left = 0;
	// int right = row * columns - 1;
	// int columns = matrix[0].length;
	
	// while( left <= right) Logiccccccccc........
	//int midpoint_element = matrix[midpoint/columns][midpoint%columns];
	
	public static boolean searchmatrix(int[][] matrix, int target)
	{
		int[] row = function(matrix, target);
		
		// Also use binary search better efficiemcy.....
		
		for(int i=0; i<row.length; i++)
		{
			if(row[i] == target)
			{
				return true;
			}
		}
		return false;
	}
	
	public static int[] function(int[][] matrix, int target)
	{
		int n = matrix.length;
		int result[] = new int[matrix[0].length];
				
		for(int i=0; i < n; i++)
		{
			if(target >= matrix[i][0] && target <= matrix[i][n])
			{
				for(int j=0; j<matrix[i].length; j++)
				{
					result[j] = matrix[i][j];
				}
                
				return result;
			}
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
