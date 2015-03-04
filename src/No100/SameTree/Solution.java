package No100.SameTree;

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null || q.val!=p.val ) return false;
        if(isSameTree(p.left,q.left)==false || isSameTree(p.right,q.right)==false) return false;
        return true;
    }
}