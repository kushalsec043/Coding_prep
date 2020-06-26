package Nick_White3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet59
{
	public static void main(String[] args)
	{
		int[] nums = {2,2,1};
		
		// Single non_repeating number in a list
		
		// Hashmap
		// If contains key then add + 1 to value
		
		// End loop through hashmap to get value == 1
		// Return key...
		
		/*for(Map.Entry<Integer, Integer> entry : nums.entrySet())
		{
			
		}*/
		
		// XOR method..............
		
		int result = 0;
		
		for(int i=0; i<nums.length; i++)
		{
			result ^= nums[i];
		}
		
		System.out.println(result);
	}
}
