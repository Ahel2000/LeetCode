class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)return false;
        int k=1;
        for(int i=1;i<=20;i++){
            if(k==n)return true;
            k*=3;
        }
        
        return false;
    }
}