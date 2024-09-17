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
    ArrayList<Integer> l=new ArrayList<>();
    public void i(TreeNode u){
        if(u==null)
        return;
        i(u.left);
        l.add(u.val);
        i(u.right);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        i(root);
        return l;
    }
}