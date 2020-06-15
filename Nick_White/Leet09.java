/*package Nick_White;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.sun.org.apache.bcel.internal.classfile.Node;

public class Leet09 {

	public static void main(String[] args) 
	{
		
	}
	public List<Integer> preorder(Node root)
	{
		LinkedList<Node> stack = new LinkedList();
		
		List<Integer> output = new LinkedList();
		
		if(root == null)
		{
			return output;
		}
		
		stack.add(root);
		
		while(!stack.isEmpty())
		{
			Node node = stack.pollLast();
			
			output.add(node.val);
			
			Collections.reverse(node.children);
			
			for(Node child: node.children)
			{
				stack.add(child);
			}
		}
		return output;
	}

}*/
