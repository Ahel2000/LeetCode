class Solution {
    public int maxProfit(int[] prices) {
        
        int n=prices.length;
        if(n==0)return 0;
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(prices[i]<minPrice)minPrice=prices[i];
            else if((prices[i]-minPrice)>maxProfit)maxProfit=prices[i]-minPrice;
        }
        return maxProfit;
    }
}
