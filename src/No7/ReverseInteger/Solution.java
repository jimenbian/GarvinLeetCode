package No7.ReverseInteger;

public class Solution {
	 public static int reverse(int x) {
		 if(Math.abs(x)>100){
			 return 0;
		 }
		 else{
	     String x_str=Integer.toString(x);
	     char[] x_char = x_str.toCharArray();
	     String x_reverse_str="";
	     //System.out.print(Character.isDigit(x_char[0]));
	    if(Character.isDigit(x_char[0])){	    	 
	    	 for(int i=(x_str.length()-1);i>=0;i--){
	    		 x_reverse_str+=x_char[i];
	      	 }	    		 
	    	 }
	    else{
	    	  x_reverse_str+=x_char[0];
	    	  for(int i=(x_str.length()-1);i>=1;i--){
		    		 x_reverse_str+=x_char[i];
		    	 }	    	  	    	
	    }	    
	     return Integer.parseInt(x_reverse_str);}
		 
	    }

	 public static void main(String[] args){
		 System.out.print(""+reverse(16416312));
	 }
	 
}
//public class Solution {
//    public int reverse(int x) {
//        int sum = 0;
//        while (Math.abs(x) != 0)
//        {
//            if(Math.abs(sum) > Integer.MAX_VALUE / 10)
//            {
//                return 0;
//            }
//            sum = sum * 10 + x % 10;
//            x = x / 10;
//        }
//
//        return sum;
//    }
//}