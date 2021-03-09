class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n=nums.length;
        if(n<=1)return n;
        
        int inc[]=new int[n];
        int dec[]=new int[n];
        
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    inc[i]=Math.max(inc[i],1+dec[j]);
                }else if(nums[i]<nums[j]){
                    dec[i]=Math.max(dec[i],1+inc[j]);
                }
            }
        }
        
        return 1+Math.max(inc[n-1],dec[n-1]);
    }
}