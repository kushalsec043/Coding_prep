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

public class Leet38
{
	
	// LeetCode Find Bottom Left Tree Value Explained - Java
	
	/*public static void main(String[] args)
	{
    
	 }*/
	
	/*public int findBottom(TreeNode root)
	{
		Queue<TreeNode> queue = new LinkedList();
		queue.offer(root);
		
		while(!queue.isEmpty())
		{
			root = queue.poll();
			
			if(root.right != null)
			{
				queue.offer(root.right);
			}
			if(root.left != null)
			{
				queue.offer(root.left);
			}
		}
		
		return root.val;
	}
	
	public int bottomleft(TreeNode root, int level)
	{
		int val = 0;
		int current_level = level;
		
		if(root == null)
		{
			return null;
		}
		
		TreeNode left = bottomleft(root.left,level+1);
		
		if(level > current_level)
		{
		val = left.val;
		}
		
		TreeNode right = bottomleft(root.right, level+1);
	
		return val;
	}*/
}
