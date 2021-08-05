class Solution {
    public int[] prisonAfterNDays(int[] cells, int n) {
        HashSet<String> set = new HashSet<>();
        int i = 0;
        boolean isCycle = false;
        while(i < n){
            int nextState[] = findNext(cells);
            String key = Arrays.toString(nextState);
            if(!set.contains(key)){
                set.add(key);
                i++;
            }else{
                isCycle = true;
                break;
            }
            
            cells = nextState;
        }
        
        if(isCycle){
            n = n % i;
            int j = 0;
            while(j++ < n){
                cells = findNext(cells);
            }
        }
        
        return cells;
    }
    
    public int[] findNext(int[] cells){
        int temp[] = new int[8];
        for(int i=1;i<=6;i++){
            if(cells[i-1] == cells[i+1])temp[i] = 1;
            else temp[i] = 0;
        }
        
        return temp;
    }
}