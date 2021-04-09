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
    int ans=0;
    public int deepestLeavesSum(TreeNode root) {
        int height=height(root);
        solve(root,height,0);
        return ans;
    }
    
    public int height(TreeNode root){
        if(root==null)return 0;
        
        return 1+Math.max(height(root.left),height(root.right));
    }
    
    public void solve(TreeNode root,int height,int curr){
        if(root==null)return;
        if(curr==height-1){
            ans+=root.val;
            return;
        }
        
        solve(root.left,height,curr+1);
        solve(root.right,height,curr+1);
    }
}