/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode ans;
    public void in(TreeNode root){
        if(root == null) return ;
        in(root.left);
        ans.right=new TreeNode(root.val,null,null);
        ans=ans.right;
        in(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dum=new TreeNode(0,null,null);
        ans=dum;
        in(root);
        return dum.right;

    }
}