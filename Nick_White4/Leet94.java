package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet94 
{
	public static void main(String[] args)
	{
		// Sum of subarray to find sum to k
	}

	public int subarraysum(int[] num, int k)
	{
		HashMap<Integer, Integer> array_sum = new HashMap();
		array_sum.put(0, 1);
		
		int sum = 0;
		int result = 0;
		
		for(int i=0; i<num.length; i++)
		{
			sum += num[i];
			
			if(array_sum.containsKey(sum - k))
			{
				result += array_sum.get(sum - k);
			}
			
			array_sum.put(sum, array_sum.getOrDefault(sum, 0)+1);
			
		}
		
		return result;
	}
}