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
class pair{
    int val;
    int ind;
    pair(int val,int ind){
        this.val=val;
        this.ind=ind;
    }
}
class Solution {
    public int fun(pair a[]){
        int u=0;
        Arrays.sort(a,(x,y)->x.val-y.val);
        for(int i=0;i<a.length;){
            if(i == a[i].ind) i++;
            else{
                u++;
                pair t=a[a[i].ind];
                a[a[i].ind]=a[i];
                a[i]=t;
            }
        }
        // System.out.println(u);
        return u;
    }
    public int minimumOperations(TreeNode root) {
        if(root == null)return 0;
        int c=0;
        Queue<TreeNode>q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            pair [] a=new pair[s];
            for(int i=0;i<s;i++){
                TreeNode curr=q.poll();
                a[i]=new pair(curr.val,i);
                if(curr.left != null)q.offer(curr.left);
                if(curr.right != null)q.offer(curr.right);
            }
            c+=fun(a);
        }
        return c;
    }
}