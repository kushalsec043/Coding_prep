package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet95 
{
	public static void main(String[] args)
	{

	
	}

	// Reorder List
	//1->2->3->4->null
	//8->7->6->5->null
	
	/*public void reorderList(ListNode head)
	{
		
		//Go to middle of list & divide....
		//Reverse the second half.....
		//Construct new linked list using above two...
		
		if(head== null || head.next == null)
		{
			return;
		}
		
		//Head of first half
		ListNode l1 = head;
		
		//head of second half
		ListNode slow = head;
		
		//tail of second half
		ListNode fast = head;
		
		//tail of first half
		ListNode prev = null;
		
		while(fast != null && fast.next != null)
		{
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		
		prev.next = null;
		
		Listnode l2 = reverseLinked(slow);
		
		merge(l1, l2);
	}
	
	public ListNode merge(ListNode l1, ListNode l2)
	{
		while(l1 != null)
		{
			ListNode l1_next = l1.next;
			ListNode l2_next = l2.next;
			
			l1.next = l2;
			
			if(l1_next == null)
			{
				break;
			}
			
			l2.next = l1_next;
			
			l1 = l1_next;
			l2 = l2_next;
		}
	}
	
    public ListNode reverseLinked(ListNode head)
    {
    	ListNode prev = null;
    	
    	 while(head != null)
    	 {
    		 ListNode next_node = head.next;
    		 head.next = prev;
    		 prev = head;
    		 head = next_node;
    	 }
    	 
    	 return prev;
    }*/
	
	
	
	
	
	
	
	
	
}