class Solution {
    int[][] cache;
    public boolean canPartition(int[] nums) {
        int sum=0,n=nums.length;
        for(int i=0;i<n;i++)sum+=nums[i];
        if(sum%2==1)return false;
        cache=new int[nums.length+1][sum/2+1];
        for(int i=0;i<nums.length+1;i++)Arrays.fill(cache[i],-1);
        return canPartition(nums,nums.length,sum/2);
    }
    
    public boolean canPartition(int[] nums,int n,int target){
        if(n==0)return false;
        if(target==0)return true;
        if(cache[n][target]==1)return true;
        if(cache[n][target]==0)return false;
        if(nums[n-1]<=target){
            cache[n][target]=(canPartition(nums,n-1,target-nums[n-1])||canPartition(nums,n-1,target))?1:0;
        }else{
            cache[n][target]=canPartition(nums,n-1,target)?1:0;
        }
        return cache[n][target]==1;
    }
}