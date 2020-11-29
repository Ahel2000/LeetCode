class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        if(m==0 || n==0)return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        if(g[0]>s[m-1])return 0;
        int i=0,j=0,num=0;
        
        while(i<n && j<m){
            if(g[i]<=s[j]){
                i++;
                j++;
                num++;
            }else{
                j++;
            }
        }
        return num;
    }
}
