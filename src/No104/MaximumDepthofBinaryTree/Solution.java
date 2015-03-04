package No104.MaximumDepthofBinaryTree;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    List<Integer> deep_list=new ArrayList<Integer>();
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        getDepth(root,1);
        int max=1;
        for(int i=0;i<deep_list.size()-1;i++){
            if(deep_list.get(i)>max){
                max=deep_list.get(i);
            }
            
        }
        return max;
    }
    public void getDepth(TreeNode root,int height){
        if(root==null)  
        {
            deep_list.add(height-1) ;
            return;
        }
        getDepth(root.left,height+1);
        getDepth(root.right,height+1);
    }
}