package Nick_White3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Leet64
{
	public static void main(String[] args)
	{
		
	}

	
	// Sum of Even numbers after queries
	
	public int[] sumevenafterqueries(int[] A, int[][] queries)
	{
		int S = 0;
		
		for(int x: A)
		{
			if(x%2 == 0)
			{
				S += x;
			}
		}
		int[] ans = new int[queries.length];
		
		for(int i=0; i<queries.length; ++i)
		{
			int val = queries[i][0];
			int index = queries[i][1];
			
			if(A[index] % 2 == 0)
			{
				S -= A[index];
			}
			A[index] += val;
			
			if(A[index] % 2 == 0)
			{
				S += A[index];
			}
			
			ans[i] = S;
		}
		
		return ans;
	}
}
