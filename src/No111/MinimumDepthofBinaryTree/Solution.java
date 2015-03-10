package No111.MinimumDepthofBinaryTree;

public class Solution {
	static int deep=0;
    public static int minDepth(TreeNode root) {
        if(root==null) return 0;
        minDepthHelp(root,0);
        return deep;
    }
    public static void  minDepthHelp(TreeNode root, int height){
        if(root==null) {deep= height;return;}
        minDepthHelp(root.left,height+1);
        minDepthHelp(root.right,height+1);
        
    }
    public static void main(String[] args){
    	        TreeNode a=new TreeNode(0);
    	        System.out.print(minDepth(a)+"");
    }
}