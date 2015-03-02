package No83.RemoveDuplicatesfromSortedList;

public class Solution {
	 public static ListNode deleteDuplicates(ListNode head) {
	        if (head==null || head.next==null) return head; 
	        ListNode first = head;
	        ListNode second=head.next;
	        while(second!=null){
	            if(first.val==second.val){
	                second=second.next;
	                first.next=second;
	            }	            
	            else{
	            	  first=first.next;
	            	  second=first.next;
	            		
	            }
	            
	        }
	        
	        return head;
	    }
	 public static void main(String[] args){
		 ListNode head=new ListNode(2);
		 ListNode head1=new ListNode(2);
		 ListNode head2=new ListNode(2);
		 ListNode head3=new ListNode(3);
		 ListNode head4=new ListNode(3);
		 head.next=head1;
		 head1.next=head2;
		 head2.next=head3;
		 head3.next=head4;
		 deleteDuplicates(head);
		 while(head!=null){
			 System.out.print(head.val+"");
			 head=head.next;
		 }
	 }
}
