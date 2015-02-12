package No27.RemoveElement;

public class Solution {
    
    
    	    public int removeElement(int[] A, int elem) {
    	    int next = 0;
    	    for(int i = 0; i < A.length; i++) {
    	        if(A[i] != elem) {
    	            A[next++] = A[i];
    	        }
    	    }
    	    return next;
    	    }
     	
    
    public static void main(String[] args){
    	    	int A[]={1};
    	    //System.out.print(""+removeElement(A,1));
    }
}