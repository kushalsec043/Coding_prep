package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet96 
{
	public static void main(String[] args)
	{

	// Reverse a linked list between a given range.....
	}

	//Problem description
	
	// 1->2->3->4->5
	// 1->4->3->2->5
	
	/*public ListNode reverseBetween(ListNode head, int m, int n)
	{
		if(head == null)
		{
			return null;
		}
		
		ListNode prev = null;
		ListNode current = head;
		
		while(m > 1)
		{
			prev = current;
			current = current.next;
			m--;
			n--;
		}
		
		ListNode connection = prev;
		ListNode tail = current;
		
		while(n > 0)
		{
			ListNode next_node = current.next;
			current.next = prev;
			prev = current;
			current = next_node;
			
			n--;
		}
		
		if(connection != null)
		{
			// 1 -> 4
			connection.next = prev;
		}
		else
		{
			// If null then connect to head
			head = prev;
		}
		
		// 2 -> 5
		tail.next = current;
		
		return head;
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
}