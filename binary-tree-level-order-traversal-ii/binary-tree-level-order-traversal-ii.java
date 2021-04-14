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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null)return l;
        
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            Queue<TreeNode> q=new LinkedList<>();
            
            while(!queue.isEmpty()){
                if(queue.peek().left!=null)q.add(queue.peek().left);
                if(queue.peek().right!=null)q.add(queue.peek().right);
                temp.add(queue.poll().val);
            }
            
            l.add(temp);
            queue=q;
        }
        
        Collections.reverse(l);
        return l;
    }
}