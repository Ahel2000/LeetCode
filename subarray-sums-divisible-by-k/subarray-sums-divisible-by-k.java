class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum=0;
        int a[] = new int[k];
        int total=0;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            a[((sum%k)+k)%k]++;
            if(((sum%k)+k)%k==0)total++;
        }
        
        for(int i=0;i<k;i++){
            total+=a[i]*(a[i]-1)/2;
        }
        
        return total;
    }
}