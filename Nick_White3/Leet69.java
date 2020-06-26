package Nick_White3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Leet69
{
	public static void main(String[] args)
	{
		
		String str = "aaaabaacaaaa";
		
		System.out.println(validPalindrome(str));
	}
	
	
	
	public static boolean validPalindrome(String s)
	{
		int i = 0;
		int j = s.length()-1;
		
		int count = 0;
		
		while(i <= j)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return helpermethod(s, i+1, j)||helpermethod(s, i, j-1);
			}
			
	     	i++;
			j--;
		}	
		return true;
	}



	private static boolean helpermethod(String s, int a, int b) 
	{
		int i = 0;
		int j = s.length()-1;
		
		int count = 0;
		
		while(i <= j)
		{
			if(s.charAt(i) != s.charAt(j))
			{
				return false;
			}
			
	     	i++;
			j--;
		}	
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
