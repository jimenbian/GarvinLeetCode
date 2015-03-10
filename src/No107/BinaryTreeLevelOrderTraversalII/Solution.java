package No107.BinaryTreeLevelOrderTraversalII;

ppublic class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<List<Integer>>();
         if(root==null) return res;
         getRes(res,root,0);
          List<List<Integer>> result=new ArrayList<List<Integer>>();
         for(int i=res.size()-1;i>=0;i--){
             result.add(res.get(i));
         }
         return result;
     }
     public void getRes(List<List<Integer>> res,TreeNode root,int height){
         if(root==null) return;
         if(height>=res.size()){
             res.add(new ArrayList<Integer>());
         }
         res.get(height).add(root.val);
         getRes(res,root.left,height+1);
         getRes(res,root.right,height+1);
     }
 }