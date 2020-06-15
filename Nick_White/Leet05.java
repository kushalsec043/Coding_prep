package Nick_White;

import java.util.HashMap;
import java.util.Map;

public class Leet05 
{
	public static void main(String[] args) 
	{
		
		// Two sum problem for a given target.....
		
		 int arr[] = {2,7,7,9,11};
		 int result[] = twosum(arr, 9);
		 
		 System.out.print(result[0] + " " + result[1]);
	}
	
	//Solve using two pointers......
	
	public static int[] twosum(int arr[], int target)
	{
		int result[] = new int[2];
		
		Map<Integer, Integer> map = new HashMap();
		
		for(int i=0; i<arr.length; i++)
		{
			int sum = target-arr[i];
			
			if(map.containsKey(sum))
			{
				result[0] = map.get(sum)+1;
				result[1] = i+1;
				return result;
			}
			
			map.put(arr[i], i);
		}
		return result;
	}

}
