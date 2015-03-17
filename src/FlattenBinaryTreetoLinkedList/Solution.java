package FlattenBinaryTreetoLinkedList;

public class Solution {
     public static void flatten(TreeNode root){
    	     if (root==null) return;
    	     fff(root);
    	     
     }
     public static void fff(TreeNode root){
    	    if (root.left==null && root.right==null) return;
    	    TreeNode temp;
    	    if(root.right!=null){
    	       	temp=root.right;
    	    	    fff(temp);
    	    }
    	    else{
    	    	  temp=null;
    	    }
    	    if(root.left!=null){
    	    	   root.right=root.left;
    	    	   root.left=null;
    	    	   fff(root.right);
    	    	   while(root.right!=null){
    	    		   root=root.right;
    	    	   }
    	    }
    	    if(temp!=null){
    	    	  root.right=temp;
    	    }
     }
     public static void main(String[] args){
    	      TreeNode a1=new TreeNode(1);
    	      TreeNode a2=new TreeNode(2);
    	      TreeNode a3=new TreeNode(3);
    	      TreeNode a4=new TreeNode(4);
    	      TreeNode a5=new TreeNode(5);
    	      TreeNode a6=new TreeNode(6);
    	      a1.left=a2;
    	      a1.right=a5;
    	      a5.right=a6;
    	      a2.left=a3;
    	      a2.right=a4;
    	      flatten(a1);
    	      while(a1!=null){
    	    	      System.out.print(""+a1.val);
    	    	      a1=a1.right;
    	      }
     } 
}
