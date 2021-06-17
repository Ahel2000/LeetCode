class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far = 0, max_till_here = 0;
        for(int i=0;i<nums.length;i++){
            max_so_far = max_so_far + nums[i];
            
            if(max_so_far < 0){
                max_so_far = 0;
            }
            
            max_till_here = Math.max(max_till_here,max_so_far);
        }
        
        Arrays.sort(nums);
        if(nums[nums.length-1] < 0)return nums[nums.length-1];
        return max_till_here;
    }
}