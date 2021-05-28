class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int num = 0,cost = 0;
        for(int i = 0; i < costs.length ; i++){
            cost+=costs[i];
            if(cost > coins)break;
            num++;
        }
        
        return num;
    }
}