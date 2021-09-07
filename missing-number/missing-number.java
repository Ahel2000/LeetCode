class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exp = n * (n + 1) / 2;
        int act = 0;
        for(int i=0;i<n;i++)act += nums[i];
        
        return exp - act;
    }
}