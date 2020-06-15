/*
package Nick_White;

import java.util.List;

import javafx.scene.Node;

public class Leet08 
{
	public static void main(String[] args) 
	{
		
	}
	// In order traversal of binary tree........
	
	public List<Integer> Inorder(Node node)
	{
		Stack<Node> stack = new Stack();
		
		List<Integer> output = new ArrayList<>();
		
		if(root == null)
		{
			return output;
		}
		
		Node current = root;
		
		while(current != null || !stack.isEmpty())
		{
			while(current != null)
			{
			//Push the root...
			//Now traverse left....
			//Add all until its null
			//Pop last in and add it's value to list
			//Move right with popped element....
			 
				stack.push(current);
				current = current.left();
			}
			
			current = stack.pop();
			output.add(current.val);
			current = current.right;
		}
		
		return output;
	}
		
		
}
*/