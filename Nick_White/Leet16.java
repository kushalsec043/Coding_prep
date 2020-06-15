package Nick_White;

public class Leet16 
{
	public static void main(String[] args) 
	{
		
	}
    
	/*public boolean haspathsum(Treenode node, int sum)
	{
		if(root == null)
		{
			return false;
		}
		
		Stack<TreeNode> node_stack = new Stack();
		Stack<Integer> sum_stack = new Stack();
		
		node_stack.add(root);
		sum_stack.add(sum-root.val);
		
		while(!node_stack.isEmpty())
		{
			Treenode current_node = node_stack.pop();
			int current_sum = sum_stack.pop();
			
			if(current_sum.left == null && current_sum.right == null
					&& current_sum == 0)
			{
				return true;
			}
			
			if(current_node.left != null)
			{
				node_stack.add(current_node.left);
				sum_stack.add(current_sum - current_node.left.val);
			}
			if(current_node.right != null)
			{
				node_stack.add(current_node.right);
				sum_stack.add(current_sum - current_node.right.val);
			}
		}
		
		return false;
		
	}
	*/
	int total = 0;
	
	/*public int tree(Treenode root, int total)
	{
		if(root == null)
		{
			return total;
		}
		
		tree(root.left, total);
		tree(root.right, total);
		total += total;
	}*/
}
