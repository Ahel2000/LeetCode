class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int pre[] = new int[n];
        int sum = nums[0];
        for(int i = 1; i < n; i++){
            pre[i] = pre[i-1] + nums[i-1];
            sum+=nums[i];
        }
        
        int[] diff = new int[n];
        for(int i=0;i<n;i++){
            int postsum = sum - pre[i] - nums[i];
            diff[i] = (i*nums[i] - pre[i]) + (postsum - (n-i-1)*nums[i]);
        }
        
        return diff;
    }
}