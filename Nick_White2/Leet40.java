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

public class Leet40
{
	
	// LeetCode Range Sum of BST Explained - Java
	
	/*public static void main(String[] args)
	{
    
	 }*/
	
	/*int range_sum;
	public int range_sum(TreeNode root, int l, int r)
	{
		range_sum = 0;
		generatesum(root, l, r);
		return range_sum;
	}
	
	public static void generatesum(TreeNode root, int l, int r)
	{
		if(root != null)
		{
			if(root.val >= l && root.val <= r)
			{
				range_sum += root.val;
			}
			
			if(root.val > l)
			{
				generatesum(root.left, l, r);
			}
			if(root.val < r)
			{
				generatesum(root.right, l, r);
			}
		}
	}*/
	
	/*public int rangeSumBst(TreeNode root, int l, int r)
	{
		int range_sum = 0;
		
		Stack<TreeNode> stack = new Stack();
		
		stack.push(root);
		
		while(!stack.isEmpty())
		{
		TreeNode node = stack.pop();
		
			  if(node.val >= l && node.val <= r)
			  {
				  range_sum += node.val;
			  }
			
			if(node.val > l && node.left != null)
			{
				stack.push(node.left);
			}
			if(node.val < r && node.right != null)
			{
				stack.push(node.right);
			}
		}
		return range_sum;
	}*/
}
