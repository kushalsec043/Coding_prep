package Nick_White3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet54
{
	
	// Spiral matrix elements retrieval..............
	
	public static void main(String[] args) 
	{
		int arr[][] = generatematrix(3);
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
 
	public static int[][] generatematrix(int n)
	{
		int arr[][] = new int[n][n];
		
		if(n == 0)
		{
			return arr;
		}
		
		int rowbegin = 0;
		int rowend = n-1;
		int colbegin = 0;
		int colend = n-1;
		
		int increment = 1;
		
		while(rowbegin <= rowend && colbegin <= colend)
		{
			for(int i = colbegin; i<= colend; i++)
			{
				arr[rowbegin][i] = increment++;
			}
			
			rowbegin++;
			
			for(int i = rowbegin; i <= rowend; i++)
			{
				arr[i][colend] = increment++;
			}
			
			colend--;
			
			if(rowbegin<=rowend)
			{
				for(int i=colend; i >= colbegin; i--)
				{
					arr[rowend][i] = increment++;
				}
			}
			
			rowend--;
			
			
			if(colbegin<=colend)
			{
				for(int i=rowbegin; i >= rowend; i--)
				{
					arr[i][colbegin] = increment++;
				}
			}
			
			colbegin++;
		}
		return arr;
	}
}
