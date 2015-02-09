package No19.RemoveNthNodeFromEndofList;

public class Solution {
	public static ListNode removeNthFromEnd(ListNode head, int n) {
	    ListNode faster = head;
	    ListNode slower = head;
	    while (n > 0 && faster != null) {
	        faster = faster.next;
	        n--;
	    }
	    // Check if has only node
	    if (faster == null) return head.next; 

	    while (faster.next != null) {
	        faster = faster.next;
	        slower = slower.next;
	    }
	    // Remove slower.next which is the nth form the end
	    slower.next = slower.next.next;
	    return head;
	}
	public static void main(String[] args){
		ListNode l=new ListNode(1);
		ListNode l1=new ListNode(2);
		ListNode l3=new ListNode(3);
		ListNode l4=new ListNode(4);
		l.next=l1;
		l1.next=l3;
		l3.next=l4;
		removeNthFromEnd(l,2);
		while(l!=null){
			System.out.print(l.val+"");
			l=l.next;
		}
	}
}
