package No28.ImplementstrStr;

public class Solution {
    public static int strStr(String haystack, String needle) {
        if( needle.length()==0) return 0;
        if(haystack.length()==0 ) return -1;
        char[] haystack_char=haystack.toCharArray();
        char[] needle_char=needle.toCharArray();
        
        for(int i=0;i<haystack_char.length;i++){
        	a:
            if(haystack_char[i]==needle_char[0]){
             if(haystack_char.length-i>=needle_char.length){    
                for(int j=0;j<needle_char.length;j++){
                    
                      if(haystack_char[i+j]!=needle_char[j]){
                    	    
                        break a;
                      }
                        
                    }
                   
                
                return i;
                
              }
              else{
                   return -1;
               }
            }
        }
        return -1;
        
    }
    public static void main(String[] args){
    	
    	  System.out.print(""+strStr("mississippi", "pi"));
    }
}
