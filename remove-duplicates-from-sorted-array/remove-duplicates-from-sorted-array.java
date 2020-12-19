class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)return 0;
        int len=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[len]){
                len++;
                nums[len]=nums[i];
            }
        }
        return len+1;
    }
}
