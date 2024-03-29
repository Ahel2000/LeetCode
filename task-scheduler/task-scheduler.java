class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] map = new int[26];
        for(char c : tasks){
            map[c-'A']++;
        }
        
        Arrays.sort(map);
        
        int c = map[25] - 1;
        int total = c * n;
        
        for(int i=24;i>=0;i--){
            total = total - Math.min(map[i],c);
        }
        
        if(total < 0)return tasks.length;
        return total + tasks.length;
    }
}