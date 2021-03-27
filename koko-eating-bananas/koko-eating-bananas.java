class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start=1,end=1000000000;
        while(start<end){
            int mid=start+(end-start)/2;
            if(isValid(piles,mid,h))end=mid;
            else start=mid+1;
        }
        
        return start;
    }
    
    public boolean isValid(int[] piles,int x,int h){
        int total=0;
        for(int i=0;i<piles.length;i++){
            total+=(int)Math.ceil(piles[i]*1.0/x);
        }
        
        return total<=h;
    }
}