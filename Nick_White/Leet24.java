package Nick_White;

import java.util.Map;

public class Leet24 
{
	public static void main(String[] args) 
	{
	char[] s = {'h','e','l','l','o'};
	
	int a_pointer = 0;
	int b_pointer = s.length-1;
	
	while(a_pointer <= b_pointer)
	{
		char temp = s[a_pointer];
		s[a_pointer] = s[b_pointer];
		s[b_pointer] = temp;
		
		a_pointer += 1;
		b_pointer -= 1;
	}
	
	for(int i=0; i<s.length; i++)
	{
		System.out.print("\'" + s[i] + "\' ");
	}
	}
}
