class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        
        if(n < 4){
            return 0;
        }
        
        int x = nums.length - 4;
        int res = Integer.MAX_VALUE;
        for(int i=0;i<4;i++){
            res = Math.min(res,nums[i+nums.length-4] - nums[i]);
        }
        
        return res;
    }
}