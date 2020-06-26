package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet80 
{
	public static void main(String[] args)
	{
	  //words = ["cat", "bt", "hat", "tree"]
	}

	// Find words that can be formed by characters....
	// Use those characters only onceeeee in a word......
	
	public int countcharacters(String[] words, String chars)
	{
	int good_words = 0;
	
	int[] chars_counts = new int[26];
	
	for(char c: chars.toCharArray())
	{
		chars_counts[c - 'a']++;
	}
	
	for(String word: words)
	{
		int[] temp_char = Arrays.copyOf(chars_counts, chars_counts.length);
	
		int valid_count = 0;
		
		for(char c : word.toCharArray())
		{
			if(temp_char[c - 'a'] > 0)
			{
				valid_count++;
				temp_char[c - 'a']--;
			}
		}
		
		if(valid_count == word.length())
		{
			good_words += 1;
		}
	}

	return good_words;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
