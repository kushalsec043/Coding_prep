package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet83 
{
	public static void main(String[] args)
	{
	 int n = 15;
	 
	 System.out.println(fizzbuzz(n));
	}

  public static List<String> fizzbuzz(int n)
  {
	  List<String> output = new ArrayList();
	  
	  for(int i=1, fizz=0, buzz=0; i<=n ; i++)
	  {
		  fizz++;
		  buzz++;
		  
		  if(fizz == 3 && buzz == 5)
		  {
			  fizz = 0;
			  buzz = 0;
			  System.out.println("\" FizzBuzz \"");
		  }
		  else if(fizz == 3)
		  {
			  fizz = 0;
			  System.out.println("Fizz");
		  }
		  else if(buzz == 5)
		  {
			  buzz = 0;
			  System.out.println("Buzz");
		  }
		  else
		  {
			  System.out.println(i);
		  }
	  }
	  
	return null;
  }
	
	
	
	
	
	
	
	
}
