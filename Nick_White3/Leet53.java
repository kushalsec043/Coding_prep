package Nick_White3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet53
{
	
	// Spiral matrix elements retrieval..............
	
	public static void main(String[] args) 
	{
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		List<Integer> list = spiralorder(arr);
		
		for(int i: list)
		{
			System.out.println(i);
		}
		
	}
 
	public static List<Integer> spiralorder(int[][] matrix)
	{
		List<Integer> res = new ArrayList();
		
		if(matrix.length == 0)
		{
			return res;
		}
		
		int rowbegin = 0;
		int rowend = matrix.length-1;
		int colbegin = 0;
		int colend = matrix[0].length - 1;
		
		while(rowbegin <= rowend && colbegin <= colend)
		{
			for(int i = colbegin; i<= colend; i++)
			{
				res.add(matrix[rowbegin][i]);
			}
			
			rowbegin++;
			
			for(int i = rowbegin; i <= rowend; i++)
			{
				res.add(matrix[i][colend]);
			}
			
			colend--;
			
			if(rowbegin<=rowend)
			{
				for(int i=colend; i >= colbegin; i--)
				{
					res.add(matrix[rowend][i]);
				}
			}
			
			rowend--;
			
			if(colbegin<=colend)
			{
				for(int i=rowbegin; i >= rowend; i--)
				{
					res.add(matrix[i][colbegin]);
				}
			}
			
			colbegin++;
		}
		
		return res;
		
	}
}
