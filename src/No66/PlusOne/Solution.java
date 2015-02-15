package No66.PlusOne;

import java.util.List;
import java.util.ArrayList;


	public class Solution {
	    public static int[] plusOne(int[] digits) {
	        List<Integer> list = new ArrayList<Integer>();
	        if (digits.length == 0) {
	            return new int[0];
	        }

	        int x = 0;
	        for(int i = digits.length - 1; i >= 0; i--) {
	            x = i == digits.length - 1 ? digits[i] + 1 : digits[i] + x;
	            
	            list.add((x%10 == 0 ? 0 : x%10));
	            x = x%10 == 0 && x != 0 ? 1 : (x - x%10)/10;
	        }

	        if (x > 0) {
	            list.add(x);
	        }
	        int[] result = new int[list.size()];
	        for(int i = 0; i < list.size(); i++) {
	            result[i] = list.get(list.size() - 1 - i);
	        }

	        return result;
	    }
	    public static void main(String[] args){
//	      	int[] digits={1,3};
//	    	    int[] a=plusOne(digits);
//	    	    for(int i=0;i<a.length;i++){
//	    	    	  System.out.print(""+a[i]);
//	    	    }
	    	    char ab='1';
	    	   String a=String.valueOf(ab);
	    	    System.out.print(""+Integer.parseInt(a));
	    	    
	    }
	}

