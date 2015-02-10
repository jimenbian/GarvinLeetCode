package No26.RemoveDuplicatesfromSortedArray;



public class Solution {
        public static int removeDuplicates(int[] A){
        	  if (A.length==0) return 0;
        	  int length =A.length;
        	  int[] B=new int[length];
        	  int index=0;
        	  int temp=0;
        	  for(int i=0;i<length;i++){
        		      if(A[i]==0 && index==0){
        		    	     B[index]=0;
        		    	     index+=1;
        		      }
      			  if(A[i]!=B[temp]){
        				  B[index]=A[i];
        				  temp=index;
        				  index+=1;
        			  }        			  
        		  }
        	  int[] C=new int[index];
        	  for(int k=0;k<index;k++){
        		  C[k]=B[k];
        	  }
        	  A=C;
        	  return index;
        	  }
        public static void main(String[] args){
        	  int[] a={1,1,2};
        	  removeDuplicates(a);
        	 // System.out.print(removeDuplicates(a)+"");
        }
        	  
        }
        

