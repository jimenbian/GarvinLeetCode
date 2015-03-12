package No169.MajorityElement;

import java.util.Hashtable;
import java.util.Iterator;

public class Solution {
	 public static int majorityElement(int[] num) {
		   Hashtable<Integer,Integer> rightList = new Hashtable<Integer,Integer>();
		   for(int i=0;i<num.length;i++)
		      {
			  if(rightList.get(num[i])==null){
				  rightList.put(num[i], 1);
			  }
			  else{
				  rightList.put(num[i], rightList.get(num[i])+1);
			  }
		     }
		   int result_value=0;
		   int result_key=0;
		   for(Iterator itr = rightList.keySet().iterator(); itr.hasNext();){
			  		   int key = (Integer) itr.next(); 
			  		   if(rightList.get(key)>result_value){
			  			  result_key=key;
			  			  result_value=rightList.get(key);			  			   
			  		   }
		   }
		   return result_key;
	    }
	 public static void main(String[] args){
		 int[] num={1,3,4,3,3,7};
		 System.out.print(majorityElement(num)+"");
	 }
	 
}
