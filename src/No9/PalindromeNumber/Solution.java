package No9.PalindromeNumber;


public class Solution {
    public static boolean  isPalindrome(int x){
    	    if(x<0){
    	    	return false;
    	    }
    	    else{
    	    	  if(x==0){
    	    		  return true;
    	    	  }
    	    	  else{
    	    		  int temp=0;
    	    		  int temp_x=0;
    	    		  temp=x;
    	    		  while(temp/10!=0 || (temp<=9 && temp>0)){
    	    			  temp_x=temp_x*10;
    	    			  temp_x+=temp%10;
    	    			  temp=temp/10;
    	    		  }
    	    		  System.out.print(""+temp_x);
    	    		  if(x==temp_x){
    	    			  return true;
    	    		  }
    	    		  else{
    	    			  return false;
    	    		  }
    	    		  
    	    	  }
    	    }
    }
    public static void main(String[] args){
    	    isPalindrome(10801);
    }
}
