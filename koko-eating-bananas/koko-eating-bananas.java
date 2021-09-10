class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1,end = (int)1e9;
        
        while(start < end){
            int mid = start + (end - start) / 2;
            if(isValid(piles,h,mid))end = mid;
            else start = mid + 1;
        }
        
        return start;
    }
    
    public boolean isValid(int[] piles,int h,int x){
        int total = 0;
        for(int num : piles){
            total += (int)Math.ceil(num * 1.0 / x);
            if(total > h)return false;
        }
        
        return true;
    }
}