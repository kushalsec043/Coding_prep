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

public class Leet44
{
	

// LeetCode Maximum Width of a Binary Tree Explained - Java


	
	/*
	 * 
	 * int max_width;
	 * HashMap<Integer, Integer> left_position;
	 * 
   public int widthofbinary(TreeNode root)
   {
	max_width = 0;
	left_position = new HashMap();
	get_width(root, 0, 0);
	return max-width;
   }

	public void get_width(TreeNode root, int depth, int position)
	{
	if(root == null)
	{
	return;
	}
	left_position.computeIfAbsent(depth, x->position);
	
	max_width = Math.max(max_width, position-left_position.get(depth) +1);
	get_width(root.left,depth+1,position*2);
	get_width(root.right,depth+1, position*2+1);
	}

*/
}