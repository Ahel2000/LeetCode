class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int left=0,right=0;
        int n=customers.length;
        
        int sum=0;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0)sum+=customers[i];
        }
        
        int max=Integer.MIN_VALUE;
        int temp=0;
        while(right<n){
            if(grumpy[right]==1)temp+=customers[right];
            if(right-left+1 < X){
                right++;
            }else{
                max=Math.max(sum+temp,max);
                if(grumpy[left]==1)temp-=customers[left];
                left++;
                right++;
            }
        }
        
        
        return max;
    }
}