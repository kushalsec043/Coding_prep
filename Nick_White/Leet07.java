/*package Nick_White;

import java.util.LinkedList;

import com.sun.org.apache.bcel.internal.classfile.Node;

public class Leet07
{
	public static void main(String[] args) 
	{
		
	}

	// Postorder Traversal of binary tree....

	public List<Integer> postorder(Node node)
	{
		LinkedList<Node> stack = new LinkedList();
		LinkedList<Integer> output = new LinkedList();
		
		
		if(root == null)
		{
			return output;
		}
		
		stack.add(root);
		
		while(!stack.isEmpty())
		{
			Node node = stack.pollLast();
			output.addFirst(node.val);
			
			for(Node child: node.child)
			{
				stack.add(child);
			}
		}
		return output;
	}
}
*/