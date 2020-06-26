package Nick_White3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Leet70
{
	// Minimum sum subarray in a given large array...
	//Return min subarray size(0
	
	public static void main(String[] args)
	{
		int[] arr = {2,3,1,2,4,3};
		int s = 7;
		
		int result = minSubArray(s, arr);
		
		System.out.println(result);
	}
	
	public static int minSubArray(int s, int[] nums)
	{
		int left = 0;
		int result = Integer.MAX_VALUE;
		
		int val = 0;
		
		for(int i=0; i<nums.length; i++)
		{
			val += nums[i];
			
			while(val >= s)
			{
				result = Math.min(result, i-left+1);
				
				val -= nums[left];
				left++;
			}
		}
		
		return result != Integer.MAX_VALUE ? result:0;
	}
	
	
	
	
	
	
	
}
