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
    List<Integer> l=new ArrayList<>();
    public TreeNode increasingBST(TreeNode root) {
        TreeNode root1=new TreeNode(0);
        inorder(root);
        TreeNode curr=root1;
        for(int i=0;i<l.size();i++){
            curr.right=new TreeNode(l.get(i));
            curr=curr.right;
        }
        
        return root1.right;
    }
    
    public void inorder(TreeNode root){
        if(root!=null){
            inorder(root.left);
            l.add(root.val);
            inorder(root.right);
        }
    }
}