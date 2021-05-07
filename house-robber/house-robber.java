class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return rob(nums,n,dp);
    }
    
    public int rob(int []nums, int n, int[] dp){
        if(n<=0)return 0;
        
        if(dp[n-1]!=-1)return dp[n-1];
        
        return dp[n-1] = Math.max(rob(nums,n-1,dp),nums[n-1]+rob(nums,n-2,dp));
    }
}