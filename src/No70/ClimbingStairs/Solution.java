package No70.ClimbingStairs;

public class Solution {
    public static int climbStairs(int n) {
        if(n<=0) return 0;
        if(n-3>0){
            return climbStairs(n-2)+climbStairs(n-1);
        }
        else{
             if(n==3) return 3;
              else {
            	 if (n==2){
            		 return 2;
            	 }
            	  else{return 1;}
             }
        }
        
    }
    public static int climbStairs1(int n) {
    	   
    	      if (n==0) return 0;
    	      int k=0;//1µÄÊıÁ¿
    	      int climbNum=0;
    	      boolean[] isHas=new boolean[n+1];
    	      while(k<=n){
    	    	    int i=(n-k)%2;
    	    	    int j=(n-k)/2;
    	    	    if(isHas[k+i]==false){
    	    	    	  climbNum+=c_cal(j+i+k,i+k);
    	    	    }
    	    	    	isHas[k+i]=true;
    	    	    k++;
    	      }
    	     return climbNum;
    	      
    }
    public static int c_cal(int a,int b){
    	   if(b==0) return 1;
    	   int c1=1;
    	   int c2=1;
    	   for(int i=0;i<b;i++){
    		   c1=c1*(a-i);
    		   c2=c2*(b-i);
    	   }
    	   
    	   System.out.print(a+":"+b+"   ");
    	   
    	   return c1/c2; 
    }
 
    	  public static int climbStairs3(int n) { 
    	           if(n <= 3){ 
    	               return n; 
    	                
    	           } 
    	           else{
    	               return climbStairs3(n/2)*climbStairs3(n-n/2)+climbStairs3(n/2-1)*climbStairs3(n-n/2-1);
    	               }
    	          }
    	    
    
    public static void main(String[] args){
    	
    	   System.out.print(""+climbStairs3(50));
    }
}