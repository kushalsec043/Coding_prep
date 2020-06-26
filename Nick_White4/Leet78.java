package Nick_White4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet78 
{
	public static void main(String[] args)
	{
		//input "abbaca"
		//output "ca"
	}
	
	// Remove all adjacent duplicates in String.....
	
	public String removeDuplicates(String s)
	{
		char[] arr = new char[s.length()];
		int i=0;
		
		for(int j=0; j<s.length(); j++)
		{
			char current = s.charAt(j);
			
			if(i > 0 && arr[i-1] == current)
			{
				i--;
			}
			else
			{
				arr[i] = current;
				i += 1;
			}
		}
		return new String(arr, 0, i);
	}
}
