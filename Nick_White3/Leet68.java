package Nick_White3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Leet68
{
	public static void main(String[] args)
	{
		
	}
	
	public int maxprofit(int[] prices)
	{
		int min_val = Integer.MAX_VALUE;
		int max_profit = 0;
		
		
		for(int i=0; i<prices.length; i++)
		{
			if(prices[i] < min_val)
			{
				min_val = prices[i];
			}
			else if(prices[i] - min_val > max_profit)
			{
				max_profit = prices[i] - min_val;
			}
		}
		
		return max_profit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
