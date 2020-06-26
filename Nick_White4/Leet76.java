package Nick_White4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet76 
{
	public static void main(String[] args)
	{
       
		//[[0,0,1,1,
		// 1,0,1,1,0]}]]
	
	}
	// Max Area of island
	boolean seen[][];
	
	public int maxarea(int[][] grid)
	{
		int max_area = 0;
		
		int rows = grid.length;
		int columns = grid[0].length;
		
		seen = new boolean[rows][columns];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				max_area = Math.max(max_area, area(i, j, grid));
			}
		}
		
		return max_area;
	}
	public int area(int i, int j, int[][] grid)
	{
		if(i < 0 || j < 0 || i >= grid.length || j >= grid.length 
				|| grid[i][j] == 0 || seen[i][j])
		{
			return 0;
		}
		
		seen[i][j] = true;
		
		return (1 + area(i+1, j, grid)
		          + area(i-1, j, grid)
		          + area(i, j+1, grid)
		          + area(i, j-1, grid));
	}
	
}
