package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet93 
{
	public static void main(String[] args)
	{
		// Dail numbers with different permutations of string...
	}

	public List<String> lettercode(String digits)
	{
		LinkedList<String> output = new LinkedList();
		
		if(digits.length() == 0)
		{
			return output;
		}
		
		output.add("");
		
		String[] char_map = new String[]
		{"0","1","abc","def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		
		for(int i=0; i<digits.length(); i++)
		{
			int index = Character.getNumericValue(digits.charAt(i));
			
			// Permutation in end are of same length......
			while(output.peek().length() == i)
			{
				String permutation = output.remove();
				
				for(char c : char_map[index].toCharArray())
				{
					output.add(permutation + c);
				}
			}
		}
		return output;
	}
}