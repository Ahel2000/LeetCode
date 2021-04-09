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
    public int res=0;
    public int sumOfLeftLeaves(TreeNode root) {
        solve(root,0);
        return res;
    }
    
    public void solve(TreeNode root,int dir){
        if(root==null)return;
        
        solve(root.left,1);
        if(root.left==null && root.right==null && dir==1){
            res+=root.val;
            return;
        }
        solve(root.right,0);
    }
}