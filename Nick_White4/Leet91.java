package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet91 
{
	public static void main(String[] args)
	{
		//[[3,0,8,4],
		// [2,4,5,7],
		// [9,2,6,3],
		// [0,3,1,0]]
	}
	// Max Increase to keep city skyline 
	public int maxIncrement(int[][] grid)
	{
		int result = 0;
		int n = grid.length;
		
		int[] max_row_vals = new int[n];
		int[] max_col_vals = new int[n];
		
		for(int i=0; i<grid.length; i++)
		{
			for(int j=0; j<grid.length; j++)
			{
				max_row_vals[i] = Math.max(max_row_vals[i], grid[i][j]);
				max_col_vals[j] = Math.max(max_col_vals[j], grid[i][j]);
			}
		}
		
		for(int i=0; i<grid.length; i++)
		{
			for(int j=0; j<grid.length; j++)
			{
				// Minimum of row max and col - number....
				
				result += Math.min(max_row_vals[i], max_col_vals[j] - grid[i][j]);
			}
		}
		
		return result;
	}
}