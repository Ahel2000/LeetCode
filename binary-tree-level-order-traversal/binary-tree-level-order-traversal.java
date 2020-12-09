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
    HashMap<Integer,List<Integer>> map=new HashMap<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> l=new ArrayList<>();
        if(root==null)return Collections.emptyList();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> temp=new ArrayList<>();
            Queue<TreeNode> t=new LinkedList<>();
            while(!queue.isEmpty()){
                TreeNode tmp=queue.poll();
                temp.add(tmp.val);
                if(tmp.left!=null)t.add(tmp.left);
                if(tmp.right!=null)t.add(tmp.right);
            }
            l.add(temp);
            queue=t;
        }
        
        return l;
    }
}
