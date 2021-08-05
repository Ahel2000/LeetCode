class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int temp[] = new int[n];
        for(int i=0;i<n;i++)temp[i] = nums[i];
        
        int index = 0;
        for(int i=0;i<n;i++){
            if(temp[i] % 2 == 0)nums[index++] = temp[i];
        }
        
        for(int i=0;i<n;i++){
            if(temp[i] % 2 == 1)nums[index++] = temp[i];
        }
        
        return nums;
    }
}