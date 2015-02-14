package No38.CountAndSay;

public class Solution {
	public static String countAndSay(int n){
       String lastNum="1";       
       
       for(int i = 1; i <= n - 1 ; i++){
    	       StringBuilder sb = new StringBuilder();    
    	       char[] chars=lastNum.toCharArray();
    	       char cur=chars[0];
    	       
    	       int times=0;
    	       
    	       for(int j=0;j<lastNum.length();j++){
    	    	        	       if(cur==chars[j]){
    	    	        	    	       times++;
    	    	        	       }   
    	    	        	       else{
    	    	        	    	    sb.append(times).append(cur);
    	    	        	    	    cur=chars[j];
    	    	        	    	    times=1;
    	    	        	       }
    	    	        	       if(j == lastNum.length() - 1){
    	    	                       sb.append(times).append(cur);
    	    	                   }

                }
    	       lastNum=sb.toString();
    	       
       }
       return lastNum;
    		   
    }
	
	
	public static void main(String[] args){
		System.out.print(""+countAndSay(6));
	}

}
