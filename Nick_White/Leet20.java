package Nick_White;

public class Leet20 
{
	public static void main(String[] args) 
	{
		
	}
	
	// Bad version
	
	// true 1 true 2 false 3 false 4 false 5 false 6 false 7
	// To find first bad versionnn.....
	
	//Finf in first half or second half
	
	/*public static int firstbadversion(int n)
	{
		int left = 0;
		int right = n;
		
		while(left < right)
		{
			int mid = left + (right - left)/2;
			
			if(isBadversion(midpoint))
			{
				right = midpoint;
			}
			else
			{
				left = midpoint + 1;
			}
			
			if(left == right && isbadversion(left))
			{
				return left;
			}
		}
		return -1;
	}*/
}
