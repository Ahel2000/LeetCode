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
    public List<TreeNode> allPossibleFBT(int N) {
        List<TreeNode> l=new ArrayList<>();
        if(N==1)l.add(new TreeNode(0));
        if(N%2==1){
        for(int i=0;i<N;i++){
            List<TreeNode> left=allPossibleFBT(i);
            List<TreeNode> right=allPossibleFBT(N-i-1);
            for(TreeNode tl:left){
                for(TreeNode tr:right){
                    TreeNode root=new TreeNode();
                    root.val=0;
                    root.left=tl;
                    root.right=tr;
                    l.add(root);
                }
            }
        }
        }
        return l;
    }
}
