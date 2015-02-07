package No8.StringtoInteger;

public class Solution {

	public static int ato1i(String str){
		String num_str="";
        char[] str_char=str.toCharArray();
        char[] sympo="-+".toCharArray();
        boolean abs=true;
        for(int i=0;i<str.length();i++){
        	 if(str_char[i]==sympo[0] ||str_char[i]==sympo[1]){
        		 if(!Character.isDigit(str_char[i+1])){
        			 return 0;
        		 }
        		 if(str_char[i]==sympo[0]){
        			 abs=false;
        		 }
        	 }
      	  if(Character.isDigit(str_char[i])){       		 
   	   	      num_str+=String.valueOf(str_char[i]);      	   	 
   	        }
      	  else{
      		  if(num_str.length()!=0){
      			  break;
      		  }
      	  }
//       	  if(Character.isDigit(str_char[i])){       		 
//       	   	 num_str+=String.valueOf(str_char[i]);      	   	 
//       	    }
       	 if(num_str!=""){
       	   if(Math.abs(Integer.parseInt(num_str))>214748364){
       		   if(Integer.parseInt(num_str)>0  )
  		         {
       			   return Integer.MAX_VALUE;
  		         }
       		   else{
       			   return Integer.MIN_VALUE;
       		   }
       		  }
       		   else{
       			   if(Math.abs(Integer.parseInt(num_str))==Integer.MAX_VALUE / 10){
       				   if(Character.isDigit(str_char[i+1])){
       					   if(Integer.parseInt(num_str)>0){
       						   if((int)str_char[i+1]>=7){
       							 return Integer.MAX_VALUE;
       						   }
       					   }
       					   else{
       						if((int)str_char[i+1]>=8){
       							return Integer.MIN_VALUE;
       						}
       					   }
       				   }
       			   }
       		   }	   
  	          }
       	   }
       
	
        if(num_str!=""){
        	 if(abs){
        		 return Integer.parseInt(num_str);
        		 }
        	 else{
        		 return -Integer.parseInt(num_str);
        	 }
	    }
        else{
        	   return 0;
        }
	}
	public static void main(String[] args){
		String b="-2147483647";		
		System.out.print(""+ato1i(b));
//		String c="";
//		String b=" 3nk";
//		char[] a=b.toCharArray();
//		if(Character.isDigit(a[1])){
//			c=String.valueOf(a[1]);
//			System.out.print(""+c);
  // 	 }
	}
}
