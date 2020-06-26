package Nick_White4;

import java.util.ArrayList;
import java.util.List;

public class Leet71 {

	
	// Word subsetssssssssss
	
	public static void main(String[] args)
	{
      /*List<String> C = new ArrayList();
		
		int x = A.length;
		int y = B.length;
		
		for(int i=0; i<x; i++)
		{
			int counter = 0;
			for(int j=0; j<y; j++)
			{
				// Check if character e & o ofindex in A[i]
				// if >=0 then increment counter
				// if counter == B.length
				//Then add to a new list C....
			}
		}
		return C;*/
	}
	
	public List<String> wordSubset(String[] A, String[] B)
	{
		List<String> result = new ArrayList();
		
		
		int[] max_b = new int[26];
		
		for(int i=0; i<B.length; i++)
		{
			String current_word = B[i];
			int[] charfrequencies = get_charfreq(current_word);
			
			for(int j=0; j<26; j++)
			{
				max_b[j] = Math.max(max_b[j], charfrequencies[j]);
			}
		}
		for(int i=0; i<A.length; i++)
		{
			String current = A[i];
			int[] charfreq = get_charfreq(current);
			
			boolean valid = true;
			
			for(int j=0; j<26; j++)
			{
				if(max_b[j] > charfreq[j])
				{
					valid = false;
					break;
				}
			}
			if(valid)
			{
				result.add(current);
			}
		}
		
		return result;
	}
	
	public int[] get_charfreq(String s)
	{
		int[] result = new int[26];
		
		for(char c : s.toCharArray())
		{
			result[c - 'a']++;
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
