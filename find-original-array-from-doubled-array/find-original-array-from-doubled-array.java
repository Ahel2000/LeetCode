class Solution {
    public int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);
        int n = changed.length;
        if(n % 2 == 1)return new int[0];
        
        int freq[] = new int[100001];
        for(int x : changed)freq[x]++;
        int index = 0;
        int res[] = new int[n / 2];
        
        for(int x : changed){
            if(2 * x <= 100000 && freq[x] > 0 && freq[2 * x] > 0){
                res[index++] = x;
                freq[x]--;
                freq[2 * x]--;
            }
        }
        
        for(int f : freq){
            if(f != 0)return new int[0];
        }
        
        return res;
    }
}