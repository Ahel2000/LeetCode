class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        if(n==0)return 0;
        
        
        int maxProfit = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i] < min)min = prices[i];
            else maxProfit = Math.max(maxProfit,prices[i] - min);
        }
        
        return Math.max(0,maxProfit);
    }
}