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

public class Leet42
{
	
}

// LeetCode Distribute Coins in a Binary Tree Explained - Java

/*
int num_moves;
public int distribution(TreeNode root)
{
	num_moves = 0;
	give_coins(root);
	
	return num_moves;
}

public int give_coins(TreeNode node)
{
	if(node == null)
	{
		return 0;
	}
	
	int left = give_coins(node.left);
	int right = give_coins(node.right);
	
	num_moves += Math.abs(left) + Math.abs(right);
	
	return node.val + left + right -1;
}
*/