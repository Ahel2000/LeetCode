class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0,j = 0;
        double max = Integer.MIN_VALUE*1.0;
        double sum = 0.0;
        while(i < nums.length && j < nums.length){
            sum = sum + nums[j]*1.0;
            if(j - i + 1 < k){
                j++;
            }else{
                max = Math.max(sum / k, max);
                sum = sum - nums[i]*1.0;
                i++;
                j++;
            }
        }
        
        return max;
    }
}