package Nick_White;

import java.util.Arrays;
import java.util.Stack;

public class Leet30 
{
	
	public static void main(String[] args)
	{
		int arr[] = {-7,-3,2,3,11};
		
		int result[] = sortedSquares(arr);
		
		for(int r: result)
		{
			System.out.println(r);
		}
	}
	
	public static int[] sortedSquares(int[] A)
	{
		int[] square = new int[A.length];
		
		for(int i=0; i<A.length; i++)
		{
			square[i] = A[i] * A[i];
		}
		
		Arrays.sort(square);
		
		return square;
	}
	
	public static int[] nick(int[] A)
	{
		int N = A.length;
		int positive_pointer = 0;
		
		while(positive_pointer < N && A[positive_pointer] < 0)
		{
			positive_pointer += 1;
		}
		
		int negative_pointer = positive_pointer+1;
		
		int[] sorted_squares = new int[N];
		int counter =0;
		
		while(negative_pointer >=0 && positive_pointer < N)
		{
			//check if multiplying negative pointer gives less than positive 
			//Add to the squares array...
			
			//Decrement negative pointer
			//Increment positive pointer
			
		}
		
		//ccheck to see if any negative element left
		//Add to the array decrement negative
		
		//check to see if any positive elements left
		//Any to the array increment positive
		
		//return sqaures array.....
		
		return sorted_squares;
	}
	
}
