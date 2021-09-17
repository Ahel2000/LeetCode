class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1)return 0;
        int n = nums.length;
        int pdt = 1,left = 0;
        
        int total = 0;
        for(int i=0;i<n;i++){
            pdt = pdt * nums[i];
            while(pdt >= k)pdt /= nums[left++];
            
            total += (i - left + 1);
        }
        
        return total;
    }
}