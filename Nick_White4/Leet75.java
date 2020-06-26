package Nick_White4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet75 
{
	public static void main(String[] args)
	{
       
		int arr[] = {2,7,11,15};
		int target = 9;
		
		int res[] = twosum(arr, target);
		
		System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
	
	// Two sum
	
	public static int[] twosum(int[] nums, int target)
	{
		int result[] = new int[2];
		
		Map<Integer, Integer> map = new HashMap();
		
		for(int i=0; i<nums.length; i++)
		{
			int num = target - nums[i];
			
			if(map.containsKey(num))
			{
				result[0] = map.get(num);
				result[1] = i;
			}
			
			map.put(nums[i], i);
		}
		
		return result;
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
}
