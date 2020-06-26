package Nick_White2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leet34
{
	public static void main(String[] args)
	{
        int arr[] = {1,3,4,2,2};
        
        System.out.println(findduplicate(arr));
	}
   
	 public static int findduplicate(int[] nums)
	 {
		 Map<Integer, Integer> map = new HashMap();
		 
		 for(int i=0; i<nums.length; i++)
		 {
			 if(map.containsKey(nums[i]))
			 {
				 return nums[i];
			 }
			 else
			 {
				 map.put(nums[i], i);
			 }
		 }
		 
		 return 0;
	 }
	 
	 public static int find(int[] num)
	 {
		 int slow_pointer = num[0];
		 int fast_pointer = num[0];
		 
		 slow_pointer = num[slow_pointer];
		 fast_pointer = num[num[fast_pointer]];
		 
		 while(slow_pointer != fast_pointer)
		 {
			 slow_pointer = num[slow_pointer];
			 fast_pointer = num[num[fast_pointer]];
		 }
		 
		 int a_pointer = num[0];
		 int b_pointer = slow_pointer;
		 
		 while(a_pointer != b_pointer)
		 {
			 a_pointer = num[a_pointer];
			 b_pointer = num[b_pointer];
			 
		 }
		 
		 return a_pointer;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
