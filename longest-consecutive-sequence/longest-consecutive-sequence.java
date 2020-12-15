class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<=1)return nums.length;
        Arrays.sort(nums);
        int maxsofar=1,max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
            if(nums[i]==nums[i-1]+1)maxsofar++;
            else{
                //maxsofar=1;
                max=Math.max(max,maxsofar);
                maxsofar=1;
            }
            }
        }
        return Math.max(max,maxsofar);
    }
}
