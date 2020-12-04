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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)return null;
        return makeBST(nums,0,nums.length-1);
    }
    
    public TreeNode makeBST(int[] nums,int p,int q){
        if(p==q)return (new TreeNode(nums[p]));
        if(p<q){
        int mid=(p+q)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=makeBST(nums,p,mid-1);
        root.right=makeBST(nums,mid+1,q);
        return root;
        }
        return p==q?new TreeNode(nums[p]):null;
    }
}
