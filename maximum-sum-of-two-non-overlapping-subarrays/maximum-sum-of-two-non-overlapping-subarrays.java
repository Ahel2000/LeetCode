class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int n = nums.length;
        int prefix[] = new int[n+1];
        
        for(int i=1;i<=n;i++)prefix[i] = prefix[i-1] + nums[i-1];
        
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<=n-firstLen;i++){
            int sum1 = prefix[i+firstLen] - prefix[i];
            for(int j=0;j+secondLen<=i;j++){
                int sum2 = prefix[j+secondLen] - prefix[j];
                max = Math.max(max,sum1 + sum2);
            }
            
            for(int j=i+firstLen+1;j <= n - secondLen;j++){
                int sum2 = prefix[j+secondLen] - prefix[j];
                max = Math.max(max,sum1 + sum2);
            }
        }
        
        return max;
    }
}