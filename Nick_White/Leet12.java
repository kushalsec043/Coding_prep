package Nick_White;

public class Leet12 
{
	public static void main(String[] args) 
	{
      System.out.println(isPalindrome(12321));
	}
  
	public static boolean isPalindrome(int num)
	{
		int n = num;
		int sum = 0;
		int r = 0;
		
		if(num == 0)
		{
			return true;
		}
		
		if(num < 0 || num % 10 == 0)
		{
			return false;
		}
		
		while(n > 0)
		{
			r = n%10;
			sum = (sum * 10) + r;
			n = n/10;
		}

		if(sum == num || num == sum/10)
		{
			return true;
		}
		return false;
	}
}
