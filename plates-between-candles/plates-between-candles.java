class Solution {
    public int[] platesBetweenCandles(String s, int[][] queries) {
        int n = s.length();
        int pre[] = new int[n];
        int post[] = new int[n];
        
        int pos = -1;
        for(int i=0;i<n;i++){
            if(s.charAt(i) == '|')pos = i;
            pre[i] = pos;
        }
        
        pos = n;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i) == '|')pos = i;
            post[i] = pos;
        }
        
        int cache[] = new int[n];
        for(int i=1;i<n;i++){
            cache[i] = cache[i-1];
            if(s.charAt(i-1) == '*')cache[i]++;
        }
        
        int q = queries.length;
        int result[] = new int[q];
        for(int i=0;i<q;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            
            if(post[left] == n || pre[right] == -1)continue;
            if(pre[right] < post[left])continue;
            result[i] = cache[pre[right]] - cache[post[left]];
        }
        
        return result;
    }
}