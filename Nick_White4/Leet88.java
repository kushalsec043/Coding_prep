package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet88 
{
	public static void main(String[] args)
	{
		String str = "abcabcbb";
		System.out.print(lengthlongsubstring(str));
	}
	
	public static int lengthlongsubstring(String s)
	{
		int a_pointer = 0;
		int b_pointer = 0;
		int max = 0;
		
		HashSet<Character> hashset = new HashSet();
		
	    while(b_pointer < s.length())
	    {
	    	if(!hashset.contains(s.charAt(b_pointer)))
	    	{
	    		hashset.add(s.charAt(b_pointer));
	    		b_pointer++;
	    		
	    		max = Math.max(max, hashset.size());
	    	}
	    	else
	    	{
	    		hashset.remove(s.charAt(a_pointer));
	    		a_pointer++;
	    	}
	    }
		return max;
	}
	
	public static int lengthsubstring(String s)
	{
		HashSet<Character> set = new HashSet();
		int count = 1;
		
		for(Character c: s.toCharArray())
		{
			if(!set.contains(c))
			{
				set.add(c);
				count++;
			}
			else
			{
				count = 1;
				set.remove(c);
			}
		}
		
		return count;
	}
}
