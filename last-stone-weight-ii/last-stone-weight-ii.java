class Solution {
    int min = Integer.MAX_VALUE;
    public int lastStoneWeightII(int[] stones) {
        int dp[][] = new int[stones.length+1][stones.length*100];
        for(int i=0;i<=stones.length;i++)Arrays.fill(dp[i],-1);
        
        
        minLastStones(stones,0,dp,stones.length);
        return min;
    }
    
    public int minLastStones(int[] stones,int current,int[][] dp,int i){
        if(i == 0){
            if(current >= 0){
                min = Math.min(min,current);
                return current;
            }
            
            return Integer.MAX_VALUE;
        }
        
        if(dp[i][current] != -1)return dp[i][current];
        
        return dp[i][current] = Math.min(minLastStones(stones,current+stones[i-1],dp,i-1),
                               minLastStones(stones,Math.abs(current-stones[i-1]),dp,i-1));
    }
}