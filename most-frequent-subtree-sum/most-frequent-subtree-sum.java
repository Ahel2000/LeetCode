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
    List<Integer> l = new ArrayList<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        findSums(root);
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<l.size();i++){
            int x = l.get(i);
            if(map.containsKey(l.get(i))){
                map.put(x,map.get(x)+1);
                max = Math.max(max,map.get(x));
            }else{
                map.put(x,1);
                max = Math.max(max,1);
            }
        }
        
        List<Integer> res = new ArrayList<>();
        for(Map.Entry mapEl : map.entrySet()){
            if((int)mapEl.getValue() == max){
                res.add((int)mapEl.getKey());
            }
        }
        
        int arr[] = new int[res.size()];
        for(int i=0;i<res.size();i++)arr[i] = res.get(i);
        return arr;
    }
    
    public int findSums(TreeNode root){
        if(root == null)return 0;
        int sum = root.val;
        sum = sum + findSums(root.left);
        sum = sum + findSums(root.right);
        l.add(sum);
        
        return sum;
    }
}