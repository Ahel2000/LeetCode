class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int sum=0;
        
        
        int start=0,end=nums.length-1;
        int ans=Integer.MAX_VALUE;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            while(sum>=s){
                ans=Math.min(ans,i-start+1);
                sum-=nums[start];
                start++;
            }
        }
        
        if(ans!=Integer.MAX_VALUE)return ans;
        else return 0;
        
    }
}