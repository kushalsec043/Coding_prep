package Nick_White2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import javax.swing.tree.TreeNode;

public class Leet50
{
	public static void main(String[] args)
	{
		
	}
	
	// Peak Index In a Mountain Array.................
	
	public int peakIndex(int [] A)
	{
		int left = 0;
		int right = A.length-1;
		
		while(left < right)
		{
			int midpoint = left + (right-left)/2;
			
			if(A[midpoint] < A[midpoint+1])
			{
				left = midpoint + 1;
			}
			else
			{
				right = midpoint;
			}
		}
		
		return left;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
