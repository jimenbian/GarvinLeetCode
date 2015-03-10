package No110.BalancedBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
   
    static List<Integer> deep=new ArrayList<Integer>();
    public static boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        isBalancedHelp(root,0);
        for(int i=0;i<deep.size();i++){
        	  System.out.print(deep.get(i));
        	   for(int j=i;j<deep.size();j++){
             if(Math.abs(deep.get(i)-deep.get(j))>1){
            	  return false;
             }
             }
        }
        return true;
    }
    public static void isBalancedHelp(TreeNode root,int height){
       if(root==null) {
    	   deep.add(height); 
       return;
       }
       isBalancedHelp(root.left,height+1);
       isBalancedHelp(root.right,height+1);
       
    }
    public static void main(String[] args){
    	      TreeNode a1= new TreeNode(1);
    	      TreeNode a2= new TreeNode(2);
    	      TreeNode a3= new TreeNode(2);
    	      TreeNode a4= new TreeNode(3);
    	      TreeNode a5= new TreeNode(3);
    	      TreeNode a6= new TreeNode(3);
    	      TreeNode a7= new TreeNode(3);
    	      TreeNode a8= new TreeNode(3);
    	      TreeNode a11= new TreeNode(4);
    	      TreeNode a21= new TreeNode(4);
    	      TreeNode a31= new TreeNode(4);
    	      TreeNode a41= new TreeNode(4);
    	      TreeNode a51= new TreeNode(4);
    	      TreeNode a61= new TreeNode(4);
    	      TreeNode a71= new TreeNode(5);
    	      TreeNode a81= new TreeNode(5);
    	      TreeNode a9= new TreeNode(3);
    	      a1.left=a2;
    	      a1.right=a3;
    	      a2.left=a4;
    	      a2.right=a5;
    	      a3.left=a6;
    	      a3.right=a7;
    	      a5.left=a8;
    	      a5.right=a9;
    	      a4.left=a11;
    	      a4.right=a21;
    	      a6.left=a31;
    	      a6.right=a41;
    	      a7.left=a51;
    	      a7.right=a61;
    	      a21.left=a71;
    	      a21.right=a81;
    	      
    	      System.out.print(isBalanced(a1));
    	      
    }
}