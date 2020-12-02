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
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }
    
    public boolean isMirror(TreeNode l,TreeNode r){
        if(l==null && r==null)return true;
        if(l!=null && r!=null){
            return ((l.val==r.val) && isMirror(l.left,r.right) && isMirror(r.left,l.right));
        }
        return false;
    }
}
