class Solution {
    int []dp;
    public boolean canJump(int[] nums) {
        dp=new int[nums.length];
        Arrays.fill(dp,2);
        dp[nums.length-1]=1;
        for(int i=nums.length-2;i>=0;i--){
            int farthest=Math.min(nums.length-1,i+nums[i]);
            for(int j=i+1;j<=farthest;j++){
                if(dp[j]==1){
                    dp[i]=1;
                    break;
                }
            }
        }
        return dp[0]==1;
    } 
}
