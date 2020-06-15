package Nick_White;

import java.util.Map;

public class Leet25 
{
	public static void main(String[] args) 
	{
	String str = "A mana";
	
	
	String fixed = "";
	
	for(char c:str.toCharArray())
	{
		if(Character.isDigit(c) || Character.isLetter(c))
		{
		fixed += c;
		}
	}
	int a_pointer = 0;
	int b_pointer = fixed.length()-1;
	
	fixed = fixed.toLowerCase();
	
	while(a_pointer <= b_pointer)
	{
		if(fixed.charAt(a_pointer) != fixed.charAt(b_pointer))
		{
			System.out.println("false");
		}
		
		a_pointer += 1;
		b_pointer -= 1;
	}
	
	System.out.println("True");
	}
}
