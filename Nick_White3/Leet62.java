package Nick_White3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet62
{
	public static void main(String[] args)
	{
		
	}

	// Find common characters in a set of strings...
	
	public List<String> commonchars(String[] A)
	{
		List<String> store = new ArrayList();
		
		int[] min_freq = new int[26];
		
		Arrays.fill(min_freq, Integer.MAX_VALUE);
		
		
		for(String current: A)
		{
			int[] char_freq = new int[26];
			
			
			for(char c : current.toCharArray())
			{
				char_freq[c - 'a']++;
			}
			
			for(int i=0; i<26; i++)
			{
				min_freq[i] = Math.min(min_freq[i], char_freq[i]);
			}
		}
		
		return store;
	}
	
	
	
	
	
	
	
	
	
	
	
}
