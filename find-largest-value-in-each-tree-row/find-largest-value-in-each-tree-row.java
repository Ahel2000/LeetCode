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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        
        if(root==null)return l;
        queue.add(root);
        while(!queue.isEmpty()){
            Queue<TreeNode> q=new LinkedList<>();
            int max=Integer.MIN_VALUE;
            
            while(!queue.isEmpty()){
                if(queue.peek().left!=null)q.add(queue.peek().left);
                if(queue.peek().right!=null)q.add(queue.peek().right);
                max=Math.max(max,queue.poll().val);
            }
            
            l.add(max);
            queue=q;
        }
        
        return l;
    }
}