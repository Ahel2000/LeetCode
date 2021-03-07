class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int n=stones.length;
        if(n==1)return stones[0];
        for(int i=n-1;i>=0;i--){
            if(stones[n-1]==stones[n-2]){
                stones[n-1]=stones[n-2]=0;
            }else{
                stones[n-1]=stones[n-1]-stones[n-2];
                stones[n-2]=0;
            }
            
            Arrays.sort(stones);
        }
        
        return stones[n-1];
    }
}