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

public class Leet48
{
	public static void main(String[] args)
	{
		// Sort a Linked List............
		
		//Merge sort On Linked List
		
	}
	
	
	/*public ListNode sortList(ListNode head)
	{
		if(head == null || head.next == null)
		{
			return head;
		}
		
		ListNode temp = head;
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null)
		{
			temp = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		temp.next = null;
		
		ListNode left_side = sortList(head);
		ListNode right_side = sortList(slow);
		
		return merge(left_side, right_side);
		
	}
	
	public ListNode merge(ListNode l1, ListNode l2)
	{
		ListNode temp = new ListNode(0);
		ListNode current = temp;
		
		while(l1 != null && l2 != null)
		{
			if(l1.val < l2.val)
			{
				current.next = l1;
				l1 = l1.next;
			}
			else
			{
				current.next = l2;
				l2 = l2.next;
			}
			
			current = current.next;
		}
		
		if(l1 != null)
		{
			current.next = l1;
			l1 = l1.next;
		}
		
		if(l2 != null)
		{
			current.next = l2;
			l2 = l2.next;
		}
		
		return temp.next;
	}*/
}
