package Nick_White3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Leet56
{
	public static void main(String[] args)
	{
		//System.out.println(uniqueMorse({"1","2","3"}));
	}
	//Unique morse code transformation....
	
	public static void uniqueMorse(String[] words)
	{
		HashSet<String> unique_words = new HashSet();
		
		String MORSE[] = {"1","2","3"};
		
		for(String word : words)
		{
			StringBuilder transformation = new StringBuilder();
			
			for(char c : word.toCharArray())
			{
				transformation.append(MORSE[c - 'a']);
			}
			unique_words.add(transformation.toString());
		}
		
	}
}
