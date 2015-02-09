package No20.ValidParentheses;


import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        if(s.length()==0) return true;
        int len=s.length();
        char[] symbolFirst={'(','{','['};
        char[] symbolSecond={')','}',']'};
        char strChar[]=s.toCharArray();     
        Stack sym=new Stack();
        for(int i=0;i<len;i++){
        	  for(int j=0;j<symbolFirst.length;j++){
        		  if(strChar[i]==symbolFirst[j]){
        			  
        			  sym.push(strChar[i]);
        		  }       		  
        	  }
        	  for(int k=0;k<symbolSecond.length;k++){
        		  if(strChar[i]==symbolSecond[k]){
        			  if(sym.isEmpty()){
        				  return false;
        			  }
        			  else{
        				  if(!sym.peek().equals(symbolFirst[k])){
        					  
        					  return false;   
        			      }
        				  else{
        					  sym.pop();
        				  }
        		  }
        	  }}}
        if(sym.isEmpty())
        {
        	return true;
        }
        else{
        	return false;
        }
    }
    public static void main(String[] args){
    	    System.out.print(isValid("ffe{{{"));
    }
}
