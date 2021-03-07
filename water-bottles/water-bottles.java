class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles,emp=numBottles;
        int empty=numBottles,full=0;
        while(emp/numExchange!=0)
        {
            sum = sum+(emp/numExchange);
            emp = (emp%numExchange)+(emp/numExchange);
        }
        return sum;
    }
}