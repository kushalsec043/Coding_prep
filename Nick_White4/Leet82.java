package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet82 
{
	public static void main(String[] args)
	{
	 int arr[] = {1,1,0,1,1,1};
	 System.out.println(findmax(arr));
	}

    public static int findmax(int[] nums)
    {
    	int count = 0;
    	int max = 0;
    	
    	for(int i=0; i<nums.length; i++)
    	{
    		if(nums[i] == 1)
    		{
    			count += 1;
    			max = Math.max(max, count);
    		}
    		else
    		{
    			count = 0;
    		}
    	}
    	return max;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
