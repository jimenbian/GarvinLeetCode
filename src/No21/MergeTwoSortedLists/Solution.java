package No21.MergeTwoSortedLists;

public class Solution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
       if(l1==null && l2==null) return l1;
       if(l1==null && l2!=null) return l2;
       if(l1!=null && l2==null) return l1;
       
       if(l1.val<=l2.val){
           ListNode first=l1;
           ListNode second=l1.next;
           ListNode l2_temp=l2;
           ListNode l2_second=l2.next;
           while(l2_temp!=null){
               if(second!=null){
               if(l2_temp.val>=first.val && l2_temp.val<=second.val){
                  first.next=l2_temp;
                  l2_temp.next=second;
                  first=first.next;
                  second=first.next;                  
                 try{
                  l2_temp=l2_second;                  
                  l2_second=l2_second.next;}
                 catch (Exception e){
                	 return l1;
                 }
                                 
               }
               else{
            	      first=first.next;
                   second=first.next;
               }}
               else{
                   first.next=l2_temp;
                  return l1;
               }
              
           }
           return l1;
       }
       else{
    	   ListNode first=l2;
           ListNode second=l2.next;
           ListNode l1_temp=l1;
           ListNode l1_second=l1.next;
           while(l1_temp!=null){
               if(second!=null){
               if(l1_temp.val>=first.val && l1_temp.val<=second.val){
                  first.next=l1_temp;
                  l1_temp.next=second;
                  first=first.next;
                  second=first.next;                  
                 try{
                  l1_temp=l1_second;                  
                  l1_second=l1_second.next;}
                 catch (Exception e){
                	 return l2;
                 }
                                 
               }
               else{
            	      first=first.next;
                   second=first.next;
               }}
               else{
                   first.next=l1_temp;
                  return l2;
               }
              
           }
           return l2;
           
       }}
    public static void main(String[] args){
    	      ListNode a1=new ListNode(-10);
    	      ListNode a2=new ListNode(-5);
    	      ListNode a3=new ListNode(5);
    	      a1.next=a2;
    	      a2.next=a3;
    	      ListNode b1=new ListNode(-7);
    	      ListNode b2=new ListNode(-4);
    	      ListNode b3=new ListNode(2);
    	      b1.next=b2;
    	      b2.next=b3;
    	      ListNode c=mergeTwoLists(b1,a1);
    	      while(c!=null){
    	    	  System.out.print(""+c.val);
    	    	  c=c.next;
    	      }
    	
    }
       
    }