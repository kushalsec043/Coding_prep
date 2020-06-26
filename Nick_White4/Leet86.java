package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet86 
{
	public static void main(String[] args)
	{
	
		
	}

	// Valid license with four characters or less for first....
	
	
	public String licensekey(String S, int K)
	{
		S = S.toUpperCase();
		S = S.replaceAll("-", "");
		
		StringBuilder sb = new StringBuilder(S);
		
		for(int i=S.length()-K; i >=0; i = i-K)
		{
			sb.insert(i,"-");
		}
		
		return sb.toString();
	}
	
	
	
	
	
}
