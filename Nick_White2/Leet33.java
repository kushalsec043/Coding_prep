package Nick_White2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet33
{
	public static void main(String[] args)
	{

	}
   // Largest value in each row of a Binary Tree
	
	/*public List<Integer> largestvalue(TreeNode root)
	{
		List<Integer> largest_val = new ArrayList();
		
		helper_method(root, largest_val, 0);
		return largest_val;
	}
	
	public void helper_method(Treenode root, List<Integer> largest_val, int level)
	{
		if(root == null)
		{
			return;
		}
		
		if(level == largest_val.size())
		{
			largest_val.add(root);
		}
		else
		{
			largest_val.set(level, Math.max(largest_val.get(level), root.val));
		}
		
		helper_method(root.left, largest_val, level+1);
		helper_method(root.right, largest_val, level+1);
	}*/
}
