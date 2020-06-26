package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet89 
{
	public static void main(String[] args)
	{
	
		// Three Sum problem.....
		
	}
	
	public List<List<Integer>> threeSum(int[] nums)
	{
		Arrays.sort(nums);
		
		List<List<Integer>> output = new LinkedList();
		
		for(int i=0; i<nums.length-2; i++)
		{
			if(i == 0 || (i > 0 && nums[i] != nums[i-1]))
			{
			    int low = i+1;
			    int high = nums.length - 1;
			    int sum = 0 - nums[i];    //key....
			    
			    while(low < high)
			    {
			    	// If low + high is equal to sum required....
			    	if(nums[low] + nums[high] == sum)
			    	{
			    		output.add(Arrays.asList(nums[i], nums[low], nums[high]));
			    	
			    		// FOR ELIMINATING DUPLICATES.....
			    		while(low < high && nums[low] == nums[low+1])
			    		{
			    			low++;
			    		}
			    		while(low < high && nums[high] == nums[high-1])
			    		{
			    			high--;
			    		}
			    		low++;
			    		high--;
			    	}
			    	// If low+high is greater than sum with sorted array....
			    	else if(nums[low] + nums[high] > sum)
			    	{
			    		high--;
			    	}
			    	
			    	// If lesser than sum then move towards a higher value....
			    	else
			    	{
			    		low++;
			    	}
			    }
			}
		}
		return output;
	}
	
	
	
	
	
	
	
	
	
	
}