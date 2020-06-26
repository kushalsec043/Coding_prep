package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet98 
{
	public static void main(String[] args)
	{

	}
	
	// Remove element from last nth position in the list....
/*
	public ListNode removeNth(ListNode head, int n)
	{
		ListNode dummy_head = new ListNode(0);
		dummy_head.next = head;
		
		ListNode slow = dummy_head;
		ListNode fast = dummy_head;
		
		for(int i=1; i <= n+1; i++)
		{
			fast = fast.next;
		}
		
		while(fast != null)
		{
			slow = slow.next;
			fast = fast.next;
		}
		
		slow.next = slow.next.next;
		
		return dummy_head.next;
	}
	*/
}