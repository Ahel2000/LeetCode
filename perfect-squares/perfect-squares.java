class Solution {
    
    public int numSquares(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return find(n, map);
    }
    public int find(int n, HashMap<Integer, Integer> map){
        if(n<=3){
            return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i*i<=n; i++){
            min = Math.min(min, find(n-i*i,map)+1);
        }
        map.put(n,min);
        return min;
    }
}