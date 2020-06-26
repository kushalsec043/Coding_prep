package Nick_White3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet60
{
	public static void main(String[] args)
	{
		
	}
	
	// Self dividing number.....
	
	public List<Integer> selfdividing(int left, int right)
	{
		List<Integer> self_dividing = new ArrayList();
		
		
		for(int i=left; i<= right; i++)
		{
			if(isselfdivide(i))
			{
				self_dividing.add(i);
			}
		}
		return self_dividing;
	}
	
	public boolean isselfdivide(int num)
	{
		for(char c : String.valueOf(num).toCharArray())
		{
			if(c == '0' || num % (c - '0') > 0)
			{
				return false;
			}
		}
		return true;
	}
}
