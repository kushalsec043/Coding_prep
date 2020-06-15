package Nick_White;

public class Leet13 {

	public static void main(String[] args) 
	{
		
	}

	public int reverse(int num)
	{
		int n = num;
		int sum = 0;
		int r = 0;
		
		if(num == 0)
		{
			return num;
		}
		
		if(num < 0 || num % 10 == 0)
		{
			return 0;
		}
		
		while(n > 0)
		{
			if(sum > Integer.MAX_VALUE/10 || sum == Integer.MAX_VALUE/10 && r > 7)
				return 0;
			
			if(sum < Integer.MIN_VALUE/10 || sum == Integer.MIN_VALUE/10 && r < -8)
				return 0;
			
			r = n%10;
			sum = (sum * 10) + r;
			n = n/10;
		}

		if(sum == num || num == sum/10)
		{
			return sum;
		}
		return 0;
	}
}
