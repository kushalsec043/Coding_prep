package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet87 
{
	public static void main(String[] args)
	{
	
		
	}

	// Fruit in basketsss.....
	
	public int totalfruit(int[] tree)
	{
		int last_fruit = -1;
		int second_last_fruit = -1;
		int last_fruit_count = 0;
		int current_max = 0;
		int max = 0;
		
		for(Integer fruit: tree)
		{
			// if it's equal to last fruit or second last increment 1
			if(fruit == last_fruit || fruit == second_last_fruit)
			{
				current_max += 1;
			}
			else // If different you have to add 2 to next iteration...
			{
				current_max = last_fruit_count + 1;
			}
			
			// If you have series of same numbers 3333....
			if(fruit == last_fruit)
			{
				last_fruit_count += 1;
			}
			else  // If different number then reset to 1....
			{
				last_fruit_count = 1;
			}
			
			// 
			if(fruit != last_fruit)
			{
				second_last_fruit = last_fruit;
				last_fruit = fruit;
			}
			
			max = Math.max(current_max, max);
		}
		return max;	
	}
}
