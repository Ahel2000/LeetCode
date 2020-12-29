class Solution {
    public int search(int[] nums, int target) {
        if(nums.length==1 && nums[0]==target)return 0;
        if(nums.length==1 && nums[0]!=target)return -1;
        int k=nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                k=i;
                break;
            }
        }
        
        int start,end;
        if(target<nums[0]){
            start=k;
            end=nums.length-1;
        }else{
            start=0;
            end=k-1;
        }
        
        while(start<=end){
            int mid=(start+end)/2;
            if(target<nums[mid])end=mid-1;
            else if(target>nums[mid])start=mid+1;
            else return mid;
        }
        
        return -1;
    }
}
