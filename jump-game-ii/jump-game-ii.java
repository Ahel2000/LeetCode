class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,n);
        dp[0] = 0;
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<=i+nums[i] && j<n;j++){
                dp[j] = Math.min(dp[j],1+dp[i]);
            }
        }
        
        return dp[n-1];
    }
}