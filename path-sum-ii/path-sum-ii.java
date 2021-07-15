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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths=new ArrayList<>();
        findPaths(root,sum,new ArrayList<Integer>(),paths);
        return paths;
    }
    
    public void findPaths(TreeNode root,int sum,List<Integer> current,List<List<Integer>> paths){
        if(root == null)return;
        if(root.left ==null && root.right == null){
            if(sum == root.val){
                current.add(root.val);
                paths.add(new ArrayList<>(current));
                current.remove(current.size() - 1);
            }
            return;
        }
        
        current.add(root.val);
        findPaths(root.left,sum - root.val,current,paths);
        findPaths(root.right,sum - root.val,current,paths);
        current.remove(current.size() - 1);
    }
}