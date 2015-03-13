package No191.Numberof1Bits;

public class Solution {
    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
       if(n==0) return 0;
       if(n==1) return 1;
       int total=1;
       int index=1;
       while(n-total*2>=0){
           total=total*2;
       }
       n=n-total;
       index=index+hammingWeight(n);
       return index;
  }
    public static void main(String[] args){
    	     System.out.print(""+hammingWeight(31));
    }
}