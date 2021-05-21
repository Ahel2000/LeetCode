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
    public boolean isValidBST(TreeNode root) {
        List<Integer> l = new ArrayList<>();
        inorder(root,l);
        
        for(int i = 1 ; i < l.size() ; i++){
            if(l.get(i) <= l.get(i-1))return false;
        }
        
        return true;
    }
    
    public void inorder(TreeNode root, List<Integer> l){
        if(root != null){
            inorder(root.left,l);
            l.add(root.val);
            inorder(root.right,l);
        }
    }
}