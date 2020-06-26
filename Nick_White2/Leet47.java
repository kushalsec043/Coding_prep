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

public class Leet47
{
	public static void main(String[] args)
	{
		String result[] = { "aA", "aAAbbbbb" };
		
		System.out.println(numJewels("aA", "aAAbbbb"));
	}
	
	public static int numJewels(String J, String S)
	{
		int num_jewels = 0;
		
		for(int i=0; i<S.length(); i++)
		{
			if(J.indexOf(S.charAt(i)) > -1)
			{
				num_jewels++;
			}
		}
		
		return num_jewels;
	}
}
