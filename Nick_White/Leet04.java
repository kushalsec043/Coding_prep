package Nick_White;

public class Leet04
{
	public static void main(String[] args) 
	{
		//Reverse a linked list....
		
		/*
		 * Node prev = null; Node current = null; Node next = head;
		 * 
		 * while(next != null) { current = next;
		 * 
		 * next = next.next; current.next = prev; prev = current; } if(next == null) {
		 * head = current; }
		 */
		/*
		 * Listnode prev = null;
		 * 
		 * while(head != null) { Listnode next = head.next; head.next = prev; prev =
		 * head; head = next; } return prev;
		 */
	}
}
