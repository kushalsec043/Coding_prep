/*
package Nick_White;

public class Leet06 
{
	//Palindrome Linked list
	
	public static void main(String[] args) 
	{
		Listnode slow = head;
		Listnode fast = head;
		
		while(fast != null && fast.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		
		slow = reversed(slow);
		fast = head;
		
		// For ODD palindrome'sss 
		while(slow != null)
		{
			if(slow.val != fast.val)
			{
				return false;
			}
			
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
	public Listnode reversed(Listnode head)
	{
		Listnode prev = null;
		
		while(head != null)
		{
			Listnode next = head.next;
			head.next = prev;
			prev = node;
			head = next;
		}
		
		return prev;
	}
}
*/