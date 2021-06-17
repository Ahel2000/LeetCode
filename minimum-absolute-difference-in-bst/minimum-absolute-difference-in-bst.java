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
    public int getMinimumDifference(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inorder(root,l);
        
        int min = Integer.MAX_VALUE;
        for(int i=1;i<l.size();i++){
            min = Math.min(l.get(i) - l.get(i-1),min);
        }
        
        return min;
    }
    
    public void inorder(TreeNode root,List<Integer> l){
        if(root != null){
            inorder(root.left,l);
            l.add(root.val);
            inorder(root.right,l);
        }
    }
}