class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(nums[i],max);
        }
        
        if(max <= 0)return max;
        
        return Math.max(kadane(nums,n),reverseKadane(nums,n));
    }
    
    public int kadane(int nums[],int n){
        int res = 0,max = nums[0];
        for(int i=0;i<n;i++){
            res = Math.max(res + nums[i],nums[i]);
            max = Math.max(max,res);
        }
        
        return max;
    }
    
    public int reverseKadane(int nums[],int n){
        int res = 0,max = nums[0],total = 0;
        for(int i=0;i<n;i++){
            total = total + nums[i];
        }
        
        for(int i=0;i<n;i++){
            nums[i] = -nums[i];
        }
        
        int k = kadane(nums,n);
        
        return total + k;
    }
}