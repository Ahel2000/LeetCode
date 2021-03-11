class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left=0,right=0;
        int length=0;
        
        while(right<nums.length){
            if(nums[right]==1){
                right++;
                length=Math.max(length,right-left);
            }else{
                left=right;
                left++;
                right++;
            }
            
        }
        
        return length;
    }
}