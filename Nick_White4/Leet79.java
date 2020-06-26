package Nick_White4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet79 
{
	public static void main(String[] args)
	{
	  int arr[][] = {{0,1}};
	  
	  System.out.println(islands(arr));
	}
/*
	public static int islands(int[][] grid)
	{
	
	if(grid == null || grid.length == 0 || grid[0].length == 0)
	{
	    return 0;
	}
	
		int result = 0;
		for(int i=0; i<grid.length; i++)
		{
			for(int j=0; j<grid[i].length; j++)
			{
				if(grid[i][j] == 1)
				{
					result += 4;
				
				if(i > 0 && grid[i-1][j] == 1)
				{
					result -= 2;
				}
				
				if(j > 0 && grid[i][j-1] == 1)
				{
					result -= 2;
				}
				}
			}
		}
		
		return result;
	}
*/
	
	public static int islands(int[][] grid)
	{
		int max = 0;
		for(int i=0; i<grid.length; i++)
		{
			for(int j=0; j<grid[0].length; j++)
			{
				if(grid[i][j] == 1)
				{
					max = Math.max(max, sumreturn(i, j, grid, 0));
				}
			}
		}
		
		return max;
	}

	public static int counter = 0;
	
	private static int sumreturn(int i, int j, int[][] grid, int init_value)
	{
			if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length  || grid[i][j] == 0)
			{
				return 0;
			}
			
		grid[i][j] = 0;
		
		counter = (counter + 4) - init_value;
		
		    sumreturn(i+1, j, grid, 2);
			sumreturn(i-1, j, grid, 2);
			sumreturn(i, j+1, grid, 2);
			sumreturn(i, j-1, grid, 2);
			
			return counter;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
