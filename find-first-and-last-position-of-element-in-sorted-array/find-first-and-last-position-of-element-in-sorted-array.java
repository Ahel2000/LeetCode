class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a[]=new int[2];
        a[0]=findFirst(nums,target);
        a[1]=findLast(nums,target);
        return a;
    }
    
    public int findFirst(int []nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target && (mid==0||target>nums[mid-1])){
                return mid;
            }
            else if(nums[mid]<target)start=mid+1;
            else end=mid-1;
        }
        return -1;
    }
    
    public int findLast(int []nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target && (mid==nums.length-1||target<nums[mid+1])){
                return mid;
            }
            else if(nums[mid]>target)end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
