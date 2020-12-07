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
    List<Integer> in=new ArrayList<>();
    public int kthSmallest(TreeNode root, int k) {
        inOrder(root);
        return in.get(k-1);
    }
    
    public void inOrder(TreeNode root){
        if(root!=null){
        inOrder(root.left);
        in.add(root.val);
        inOrder(root.right);
        }
    }
}
