class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i=nums.length-1;i>=0;i--){
            sum = sum + nums[i] - nums[0];
        }
        
        return sum;
    }
}