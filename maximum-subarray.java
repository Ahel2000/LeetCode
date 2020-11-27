class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int max_so_far=0,max_ending_here=0;
        for(int i=0;i<n;i++){
            max_ending_here+=nums[i];
            if(max_so_far<max_ending_here){
                max_so_far=max_ending_here;
            }
            if(max_ending_here<0){
                max_ending_here=0;
            }
        }
        Arrays.sort(nums);
        if(nums[n-1]<0){
            return nums[n-1];
        }else{
            return max_so_far;
        }
    }
}
