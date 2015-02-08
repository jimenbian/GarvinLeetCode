package No14.LongestCommonPrefix;

public class Solution {
	   public static String longestCommonPrefix(String[] strs) {
		   if(strs.length==0) return "";
		   if(strs.length==1) return strs[0];
		   String commonPrefix="";
	       boolean end=true;
	      
	       char strChar[]=strs[0].toCharArray();
	        ok:
	        for (int j = 0;j<strChar.length;j++){
	        	
	    	     for(int i=1;i<strs.length;i++){
	    	    	   char tempChar[]=strs[i].toCharArray();
	    	    	   int tempChar_length=tempChar.length;
	    	    	   if(j<tempChar_length){
	    	    	     if(tempChar[j]==strChar[j]){
	    	    		  
	    	    	      }
	    	    	     else{
	    	    		   
	    	    		   break ok; 
	    	    	     
	    	    	      }
	    	    	     }
	    	    	   else{
	    	    		   break ok;
	    	    	   }
	    	    	   
	    	    	   
	          }
	    	     commonPrefix+=strChar[j];
		    }
	        
	       return commonPrefix;
	       }
	       
	    
	   public static void main(String[] args){
		   String str[]={"a","a","b"};
		   System.out.print(longestCommonPrefix(str) );
	   }
}
