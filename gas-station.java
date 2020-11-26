class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for(int i=0;i<gas.length;i++){
            int m=0;
            int d=0;
            for(int j=0;j<gas.length;j++){
                
                m=m-cost[(i+j)%gas.length]+gas[(i+j)%gas.length];
                if(m>=0)d++;
                else break;
            }
            if(d==gas.length)return i;
        }
        return -1;
    }
}
