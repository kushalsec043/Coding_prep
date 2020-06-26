package Nick_White3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet61
{
	public static void main(String[] args)
	{
		System.out.println('3' - '0');
	}
	
	//Sum of index 2 or min of (1,2)....
	
	public int arrayPalSum(int[] nums)
	{
		int sum = 0;
		
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-1; i+=2)
		{
			sum += nums[i];
		}
		
		return sum;
	}
}
