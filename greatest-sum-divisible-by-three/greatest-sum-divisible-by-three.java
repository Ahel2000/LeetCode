class Solution {
    public int maxSumDivThree(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int oneRemainder = 60000, twoRemainder = 60000;
        for(int i=0;i<n;i++){
            sum = sum + nums[i];
            if(nums[i] % 3 == 1){
                twoRemainder = Math.min(oneRemainder + nums[i], twoRemainder);
                oneRemainder = Math.min(nums[i], oneRemainder);
            }
            
            if(nums[i] % 3 == 2){
                oneRemainder = Math.min(twoRemainder + nums[i], oneRemainder);
                twoRemainder = Math.min(nums[i], twoRemainder);
            }
        }
        
        if(sum % 3 == 0)return sum;
        else if(sum % 3 == 1)return sum - oneRemainder;
        else return sum - twoRemainder;
    }
}