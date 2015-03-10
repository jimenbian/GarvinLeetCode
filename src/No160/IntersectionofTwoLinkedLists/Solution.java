package No160.IntersectionofTwoLinkedLists;

public class Solution {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
      
        int Aindex_length=getLength(headA);
        int Bindex_length=getLength(headB);
        int dis=Math.abs(Aindex_length-Bindex_length);
        
       
        
        ListNode Aindex=headA;
        ListNode Bindex=headB;
        if(Aindex_length>=Bindex_length){
          for(int i=0;i<dis;i++){
              Aindex=Aindex.next;
          }  
          while(Bindex!=null){
              if(Aindex.val==Bindex.val){return Aindex;}
              else{
                  Aindex=Aindex.next;
                  Bindex=Bindex.next;
                 }
          }
        }
       
         Aindex=headA;
         Bindex=headB;
      if(Aindex_length<Bindex_length){
          for(int i=0;i<dis;i++){
              Bindex=Bindex.next;
          }  
          while(Aindex!=null){
              if(Aindex.val==Bindex.val){return Aindex;}
              else{
                  Aindex=Aindex.next;
                  Bindex=Bindex.next;
                 }
          }
        }
        
        
        return null;
    }
    public static int getLength(ListNode head){
        ListNode index=head;
        int length=1;
        while(index.next!=null){
            index=index.next;
            length++;
        }
        return length;
    }
    public static void main(String[] args){
        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode b1;
        a1.next=a2;
        b1=a2;
        System.out.print(getIntersectionNode(a1,b1).val+"");
    }
}
