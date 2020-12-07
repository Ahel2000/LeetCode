/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        if(root==null || root.left==null && root.right==null)return;
        flatten(root.left);
        flatten(root.right);
        if(root.right==null){
            root.right=root.left;
            root.left=null;
        }else if(root.left!=null && root.right!=null){
            TreeNode tmp=root.right;
            root.right=root.left;
            getRightMost(root.right).right=tmp;
            root.left=null;
        }
    }
    
    public TreeNode getRightMost(TreeNode root){
        if(root==null || root.left==null && root.right==null)return root;
        return getRightMost(root.right);
    }
}
