package Nick_White;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Leet03 {

	// Check to see if any duplicates with HashSet....
	
	public static void main(String[] args) 
	{
		int arr[] = {1,1};
		
		boolean result = containsduplicate(arr);
		
		System.out.println(result);
	}
	
	public static boolean containsduplicate(int[] nums)
	{
		HashSet<Integer> numbers = new HashSet<>();
		
		for(int i=0; i<nums.length; i++)
		{
			if(numbers.contains(nums[i]))
			{
				return true;
			}
			numbers.add(nums[i]);
		}
		return false;
		
	}

}
