package Nick_White4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet73 
{
	public static void main(String[] args)
	{
      String str = removeddigits("1432219", 3);
      System.out.println(str);
    }
	
	//  Greedyyy Approach.....
	
	public static String removeddigits(String num, int k)
	{
		
		int size = num.length();
		
		if(k == size)
		{
			return "0";
		}
		
		Stack<Character> stack = new Stack();
		
		int counter = 0;
		
		while(counter < size)
		{
			while(k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(counter))
			{
				stack.pop();
				k--;
			}
			stack.push(num.charAt(counter));
			counter++;
		}
		
		//Edge casesss....
		
		while(k > 0)
		{
			stack.pop();
			k--;
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(!stack.isEmpty())
		{
			char current = stack.pop();
			sb.append(current);
		}
		
		sb.reverse();
		
		while(sb.length() > 1 && sb.charAt(0) == '0')
		{
			sb.deleteCharAt(0);
		}
		return sb.toString();
	}

}
