class Solution {
    public int totalMoney(int n) {
        int mon=1;
        int incr=1;
        int cost=0;
        for(int i=1;i<=n;i++){
            if(i%7==0){
                cost+=incr;
                mon+=1;
                incr=mon;
                continue;
            }
            
            cost+=incr;
            incr++;
        }
        
        return cost;
    }
}