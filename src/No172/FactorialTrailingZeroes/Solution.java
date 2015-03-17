package No172.FactorialTrailingZeroes;

public class Solution {
    static int index=0;
    public static int trailingZeroes(int n) {
         if(n==0) return 1;
         trailingZeroesHelper(n);
         return index;
  }
  public static void trailingZeroesHelper(int n){
      if(n==1) return;
      trailingZeroesHelper(n-1);
      if(n%5==0){
          index++;
      }
  }
  public static void main(String[] args){
	  System.out.print(""+trailingZeroes(180));
  }
    
}