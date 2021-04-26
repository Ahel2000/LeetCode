class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++)sum+=nums[i];
        if(sum%k!=0)return false;
        int cache[]=new int[k];
        return canPartition(nums,sum/k,nums.length,cache);
    }
    
    public boolean canPartition(int[] nums,int target,int n,int[] cache){
        if(n==0)return true;
        
        int v=nums[n-1];
        for(int i=0;i<cache.length;i++){
            if(cache[i]+v<=target){
                cache[i]=v+cache[i];
                if(canPartition(nums,target,n-1,cache))return true;
                cache[i]=cache[i]-v;
            }
            
            if(cache[i]==0)break;
        }
        
        return false;
    }
}