package No189.RotateArray;

public class Solution {
    public static void rotate(int[] nums, int k) {
       
        
        int len=nums.length;
        if(k==0 || k==len) return;
        if(k>len) k=k-len;
        int[] result=new int[len];
        int result_index=0;
        int j=0;
        for(int i=k;i>=1;i--){
            result[result_index]=nums[len-i];
            result_index++;
        }
        while(result_index<len){
            result[result_index]=nums[j];
            result_index++;
            j++;
        }
        for(int m=0;m<len;m++){
        	   nums[m]=result[m];
        }
    }
    public static void main(String[] args){
    	  int[] a={1,2};
    	  rotate(a,3);
    	  for(int i=0;i<2;i++){
    		  System.out.print(a[i]+"");
    	  }
    }
}