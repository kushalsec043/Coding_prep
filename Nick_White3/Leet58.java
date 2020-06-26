package Nick_White3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Leet58
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4};
		
		int arr2[] = new int[arr.length];
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2 == 0)
			{
				arr2[count] = arr[i];
				count++;
			}
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2 != 0)
			{
				arr2[count] = arr[i];
				count++;
			}
		}
		for(int i=0; i<arr2.length; i++)
		{
			System.out.print(arr2[i] + " ");
		}
	}
	
	public int[] sortby(int[] A)
	{
		int i = 0;
		int j = A.length-1;
		
		while(i<j)
		{
			if(A[i]%2 > A[j]%2)
			{
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
			
			if(A[i]%2 == 0)
			{
			i++;
			}
			
			if(A[j]%2 == 1)
			{
			j--;
			}
		}
		return A;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
