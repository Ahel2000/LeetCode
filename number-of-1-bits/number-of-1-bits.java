public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count=0;
        
        int k = 32;
        while(k-- > 0){
            if((n & 1) == 1)count++;
            n = n >> 1;
        }
        
        return count;
    }
}