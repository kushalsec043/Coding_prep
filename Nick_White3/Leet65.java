package Nick_White3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Leet65
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,6,3};
		
		//Return [2,1,6,3]
		
		int result[] = sortArray(arr);
		
		for(int i: result)
		{
			System.out.print(i + ", ");
		}
	}

	// Sort Array By Parity 2
	
	public static int[] sortArray(int[] A)
	{
		int i = 0;
		int j = 1;
		
		int n = A.length;
		
		while(i < n && j < n)
		{
			while(i < n && A[i]%2 == 0)
			{
				i += 2;
			}
			
			while(j < n && A[j]%2 == 1)
			{
				j += 2;
			}
			
			if(i < n && j < n)
			{
				int temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		return A;
	}
	
}
