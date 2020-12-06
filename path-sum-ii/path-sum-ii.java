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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths=new ArrayList<>();
        findPaths(root,sum,new ArrayList<Integer>(),paths);
        return paths;
    }
    
    public void findPaths(TreeNode root,int sum,List<Integer> current,List<List<Integer>> paths){
        if(root==null)return;
        current.add(root.val);
        if(root.val==sum && root.left==null && root.right==null){
            paths.add(current);
            return;
        }
        findPaths(root.left,sum-root.val,new ArrayList<Integer>(current),paths);
        findPaths(root.right,sum-root.val,new ArrayList<Integer>(current),paths);
    }
}
