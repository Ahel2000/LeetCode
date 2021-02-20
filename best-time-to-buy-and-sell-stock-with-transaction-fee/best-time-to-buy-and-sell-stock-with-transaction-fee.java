class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        if(n<=1)return 0;
        int cash=0,hold=-prices[0];
        
        for(int i=1;i<prices.length;i++){
            cash=Math.max(cash,hold+prices[i]-fee);
            hold=Math.max(hold,cash-prices[i]);
        }
        return cash;
    }
}