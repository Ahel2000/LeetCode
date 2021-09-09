class Solution {
    public int firstDayBeenInAllRooms(int[] nextVisit) {
        int n = nextVisit.length;
        if(n <= 1)return n;
        
        int total = 0;
        int M = 1000000007;
        long dp[] = new long[n];
        
        for(int i=1;i<n;i++){
            if(nextVisit[i-1] != i-1)dp[i] =  ((dp[i-1] + dp[i-1]) - dp[nextVisit[i-1]] + 2 + M) % M;
            else dp[i] = dp[i-1] + 2;
        }
        
        return (int)dp[n-1];
    }
}