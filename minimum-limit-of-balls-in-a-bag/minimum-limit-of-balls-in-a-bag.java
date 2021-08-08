class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int start = 1,end = 1000000000;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(isValid(mid,nums,maxOperations)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        
        return start;
    }
    
    public boolean isValid(int mid,int nums[],int maxOperations){
        int total = 0;
        for(int num : nums){
            total += (num - 1)/mid;
        }
        
        return total <= maxOperations;
    }
}