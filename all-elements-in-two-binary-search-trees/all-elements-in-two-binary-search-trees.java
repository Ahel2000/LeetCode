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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> tree1 = new ArrayList<>();
        List<Integer> tree2 = new ArrayList<>();
        inorder(root1,tree1);
        inorder(root2,tree2);
        
        for(int i=0;i<tree2.size();i++){
            tree1.add(tree2.get(i));
        }
        
        Collections.sort(tree1);
        return tree1;
    }
    
    public void inorder(TreeNode root,List<Integer> l){
        if(root != null){
            inorder(root.left,l);
            l.add(root.val);
            inorder(root.right,l);
        }
    }
}