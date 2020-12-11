class Solution {
    public int maxArea(int[] h) {
        int max=0;
        int n=h.length;
        if(n<=1)return 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(h[j]>h[i])max=Math.max(h[i]*(j-i),max);
                else max=(int)Math.max(h[j]*(j-i),max);
            }
        }
        return max;
    }
}
