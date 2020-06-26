package Nick_White3;

import java.util.Stack;

public class Leet52
{
	public static void main(String[] args) 
	{
		String str = "hdfhgdhgf-7*93638";
		
		System.out.println(reverseOnlyLetters(str));
	}
 
	public static String reverseOnlyLetters(String S)
	{
		Stack<Character> letters = new Stack();
		
		for(int i = 0; i<S.length(); i++)
		{
			if(Character.isLetter(S.charAt(i)))
			{
				letters.push(S.charAt(i));
			}
		}
		
		StringBuilder reversed_string = new StringBuilder();
		
		for(int i = 0 ; i < S.length(); i++)
		{
			if(Character.isLetter(S.charAt(i)))
			{
				reversed_string.append(letters.pop());
			}
			else
			{
				reversed_string.append(S.charAt(i));
			}
		}
		
		return reversed_string.toString();
	}
}
