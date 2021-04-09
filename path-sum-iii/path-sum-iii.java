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
    public int pathSum(TreeNode root, int sum) {
        if(root==null)return 0;
        
        return pathSum(root.left,sum)+pathSum1(root,sum)+pathSum(root.right,sum);
    }
    
    public int pathSum1(TreeNode root,int sum){
        if(root==null){
            return 0;
        }
        
        int n=0;
        if(root.val==sum)n++;
        n+=pathSum1(root.right,sum-root.val);
        n+=pathSum1(root.left,sum-root.val);
        return n;
    }
}