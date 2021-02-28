class Solution {
    public int findTargetSumWays(int[] nums, int S) {
       return findWays(nums,0,S,0); 
    }
    
    public int findWays(int[] nums,int i,int target,int curr){
        if(i==nums.length && curr==target)return 1;
        else if(i==nums.length && curr!=target)return 0;
        
        int count=findWays(nums,i+1,target,curr+nums[i])+findWays(nums,i+1,target,curr-nums[i]);
        return count;
    }
}