package Nick_White3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Leet66
{
	public static void main(String[] args)
	{
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				 System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int arr2[][] = transpose(arr);
		
		for(int i=0; i<arr2.length; i++)
		{
			for(int j=0; j<arr2[i].length; j++)
			{
				 System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	//Transpose of a Matrixxxx...
	public static int[][] transpose(int[][] A)
	{
		int B[][] = new int[A.length][A.length];
		
		for(int i=0; i<A.length; i++)
		{
			for(int j=0; j<A[i].length; j++)
			{
				B[j][i] = A[i][j];
			}
			
			System.out.println();
		}
		return B;
	}
	
	
	
	
	
	
	
	
	
}
