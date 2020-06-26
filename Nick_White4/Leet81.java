package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet81 
{
	public static void main(String[] args)
	{
	  boolean check = rotatestring("abcde","cdeab");
	
	  System.out.println(check);
	}

    public static boolean rotatestring(String A, String B)
    {
    	String C = A + A;
    	
    	if(C.contains(B))
    	{
    		return true;
    	}
    	
    	return false;
		/*
		 * char[] C = A.toCharArray();
		 * 
		 * for(int i=0; i < C.length; i++) { for(int j=0; j < C.length-1; j++) { char
		 * temp = C[j]; C[j] = C[j+1]; C[j+1] = temp; }
		 * 
		 * String check = C.toString();
		 * 
		 * if(check.compareTo(B) == 0) { return true; } } return false;
		 */
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
